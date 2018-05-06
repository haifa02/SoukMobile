/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package souk.gui;

import com.codename1.components.ScaleImageLabel;
import com.codename1.ui.ButtonGroup;
import static com.codename1.ui.Component.CENTER;
import com.codename1.ui.Container;
import com.codename1.ui.Display;
import com.codename1.ui.Form;
import com.codename1.ui.Graphics;
import com.codename1.ui.Image;
import com.codename1.ui.RadioButton;
import com.codename1.ui.Tabs;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.util.Resources;
import souk.util.SessionUser;

/**
 *
 * @author nour
 */
public class CommandesPage extends BaseForm {
    Form f;

    public CommandesPage(Resources res)  {
       
        
        super("Souk El Medina", BoxLayout.y(),res);
         System.out.println("Session "+SessionUser.getInstance());
       // f = new Form(BoxLayout.y());
        Tabs t = new Tabs();
        t.hideTabs();
        t.setUIID("Container");
        t.getContentPane().setUIID("Container");

        ScaleImageLabel page1 = new ScaleImageLabel(res.getImage("large.jpg"));
        ScaleImageLabel page2 = new ScaleImageLabel(res.getImage("large2.jpg"));
        ScaleImageLabel page3 = new ScaleImageLabel(res.getImage("large.jpg"));
        page1.setUIID("Container");
        page2.setUIID("Container");
        page3.setUIID("Container");
        page1.getAllStyles().setBgTransparency(0);
        page2.getAllStyles().setBgTransparency(0);
        page3.getAllStyles().setBgTransparency(0);
        t.addTab("", page1);
        t.addTab("", page2);
        t.addTab("", page3);

        ButtonGroup bg = new ButtonGroup();
        int size = Display.getInstance().convertToPixels(1);
        Image unselectedWalkthru = Image.createImage(size, size, 0);
        Graphics g = unselectedWalkthru.getGraphics();
        g.setColor(0xcccccc);
        g.setAntiAliased(true);
        g.fillArc(0, 0, size, size, 0, 360);
        Image selectedWalkthru = Image.createImage(size, size, 0);
        g = selectedWalkthru.getGraphics();
        g.setColor(0x8c5388);
        g.setAntiAliased(true);
        g.fillArc(0, 0, size, size, 0, 360);
        RadioButton[] rbs = new RadioButton[t.getTabCount()];
        FlowLayout flow = new FlowLayout(CENTER);
        flow.setValign(CENTER);
        flow.setValign(CENTER);
        Container radioContainer = new Container(flow);
        for (int iter = 0; iter < rbs.length; iter++) {
            rbs[iter] = RadioButton.createToggle(unselectedWalkthru, bg);
            rbs[iter].setPressedIcon(selectedWalkthru);
            rbs[iter].setUIID("Label");
            radioContainer.add(rbs[iter]);
        }

        rbs[0].setSelected(true);
        t.addSelectionListener((i, ii) -> {
            if (!rbs[ii].isSelected()) {
                rbs[ii].setSelected(true);

            }
        });

        /*Container welcomeNoteArea = BoxLayout.encloseY(message,
         LayeredLayout.encloseIn(
                        
                        
         )
         );
         welcomeNoteArea.setUIID("WelcomeNoteArea*/
          add(t);
          add(radioContainer);
     
        //f.add(t);
       // f.add(radioContainer);
    }

    public Form getF() {
        return f;
    }

    public void setF(Form f) {
        this.f = f;
    }
}
