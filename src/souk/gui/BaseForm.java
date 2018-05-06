/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package souk.gui;

import com.codename1.components.ScaleImageLabel;
import com.codename1.ui.Component;
import com.codename1.ui.Display;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Graphics;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.Toolbar;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.layouts.LayeredLayout;
import com.codename1.ui.layouts.Layout;
import com.codename1.ui.plaf.Style;
import com.codename1.ui.util.Resources;

/**
 *
 * @author HAYFA
 */
public class BaseForm extends Form {


    public BaseForm(Layout contentPaneLayout) {
        super(contentPaneLayout);
    }

    public BaseForm(String title, Layout contentPaneLayout, Resources res) {
        super(title, contentPaneLayout);
        addSideMenu(res);
    }

    public Component createLineSeparator() {
        Label separator = new Label("", "WhiteSeparator");
        separator.setShowEvenIfBlank(true);
        return separator;
    }

    public Component createLineSeparator(int color) {
        Label separator = new Label("", "WhiteSeparator");
        separator.getUnselectedStyle().setBgColor(color);
        separator.getUnselectedStyle().setBgTransparency(255);
        separator.setShowEvenIfBlank(true);
        return separator;
    }

    protected void addSideMenu(Resources res) {
        Toolbar tb = getToolbar();
      
        Image img = res.getImage("logo.png");
        if (img.getHeight() > Display.getInstance().getDisplayHeight() / 3) {
            img = img.scaledHeight(Display.getInstance().getDisplayHeight() / 3);
        }

            Label separator = new Label(" ");
    Style separatorStyle = separator.getAllStyles();
    separatorStyle.setBgImage(Image.createImage(40, 2, 0x7f000000));
    separatorStyle.setBackgroundType(Style.BACKGROUND_IMAGE_TILE_HORIZONTAL_ALIGN_CENTER);
    separatorStyle.setMargin(0, 0, 0, 0);
 // tb.getStyle().get
  
        ScaleImageLabel sl = new ScaleImageLabel(img);
        sl.setUIID("BottomPad");
        sl.setBackgroundType(Style.BACKGROUND_IMAGE_SCALED_FILL);
 ///  tb.addComponentToSideMenu( s1);
        tb.addComponentToSideMenu(  LayeredLayout.encloseIn(
            
                FlowLayout.encloseCenterBottom(
                        new Label(img)
                       // s1
                )));
        //LoginForm loginF=new LoginForm(res);
                tb.addMaterialCommandToSideMenu("Connexion", FontImage.MATERIAL_ASSIGNMENT, e -> new LoginForm(res).show());
                tb.addMaterialCommandToSideMenu("Commandes", FontImage.MATERIAL_ASSIGNMENT, e -> new CommandesPage(res).show());
       // tb.addMaterialCommandToSideMenu("Profile", FontImage.MATERIAL_SETTINGS, e -> new ProfileForm(res).show());
        // tb.addMaterialCommandToSideMenu("Logout", FontImage.MATERIAL_EXIT_TO_APP, e -> new WalkthruForm(res).show());
    }
}
