/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package souk.gui;

import com.codename1.components.FloatingHint;
import com.codename1.ui.Button;
import com.codename1.ui.Component;
import static com.codename1.ui.Component.LEFT;
import static com.codename1.ui.Component.RIGHT;
import com.codename1.ui.ComponentGroup;
import com.codename1.ui.Display;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.util.Resources;
import com.codename1.ui.TextField;
import com.codename1.ui.Container;
import com.codename1.ui.Image;
import com.codename1.ui.Toolbar;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.events.DataChangedListener;
import com.codename1.ui.util.Resources;

/**
 *
 * @author HAYFA
 */
public class LoginForm extends Form {
   
//-- DON'T EDIT BELOW THIS LINE!!!
//   private  Container gui_Container_1 = new Container(new BoxLayout(BoxLayout.Y_AXIS));
//    private Label gui_Label_1 = new Label();
//    private ComponentGroup gui_Component_Group_1 = new ComponentGroup();
//    private TextField txtLogin = new TextField();
//    private TextField txtPwd = new TextField();
// 
//    private Button btnConnexion = new Button();
//    Form f;
//    TextField login;
//    TextField password;
//    Button loginButton;
//
//    public LoginForm(Resources theme)  {
//      
//           super(new BorderLayout());
//        
//        if(!Display.getInstance().isTablet()) {
//            BorderLayout bl = (BorderLayout)getLayout();
//            bl.defineLandscapeSwap(BorderLayout.NORTH, BorderLayout.EAST);
//            bl.defineLandscapeSwap(BorderLayout.SOUTH, BorderLayout.CENTER);
//        }
//        getTitleArea().setUIID("Container");
//        setUIID("SignIn");
//        
//        add(BorderLayout.NORTH, new Label(theme.getImage("Logo.png"), "LogoLabel"));
//        
//        TextField username = new TextField("", "Username", 20, TextField.ANY);
//        TextField password = new TextField("", "Password", 20, TextField.PASSWORD);
//        username.setSingleLineTextArea(false);
//        password.setSingleLineTextArea(false);
//        Button signIn = new Button("Sign In");
//       // Button signUp = new Button("Sign Up");
//        //signUp.addActionListener(e -> new SignUpForm(res).show());
//        //signUp.setUIID("Link");
//        Label doneHaveAnAccount = new Label("Don't have an account?");
//        
//        Container content = BoxLayout.encloseY(
//                new FloatingHint(username),
//                createLineSeparator(),
//                new FloatingHint(password),
//                createLineSeparator(),
//                signIn
//               // FlowLayout.encloseCenter(doneHaveAnAccount, signUp)
//        );
//        content.setScrollableY(true);
//        add(BorderLayout.SOUTH, content);
//        signIn.requestFocus();
//        signIn.addActionListener(e -> new HomePage(theme).show());
//    }
//
//    public Form getF() {
//        return f;
//    }
//
//    public void setF(Form f) {
//        this.f = f;
//    }
 
//   
    
    
    public LoginForm(Resources theme) {
        initGuiBuilderComponents(Resources.getGlobalResources());
        getTitleArea().setUIID("Container");
        getToolbar().setUIID("Container");
        getToolbar().getTitleComponent().setUIID("SigninTitle");
        FontImage mat = FontImage.createMaterial(FontImage.MATERIAL_CLOSE, "SigninTitle", 3.5f);
        getToolbar().addCommandToLeftBar("", mat, e -> new HomePage(Resources.getGlobalResources()).show());
        getContentPane().setUIID("SignInForm");
    }

//-- DON'T EDIT BELOW THIS LINE!!!
    private com.codename1.ui.Container gui_Container_1 = new com.codename1.ui.Container(new com.codename1.ui.layouts.BoxLayout(com.codename1.ui.layouts.BoxLayout.Y_AXIS));
    private com.codename1.ui.Label gui_Label_1 = new com.codename1.ui.Label();
    private com.codename1.ui.ComponentGroup gui_Component_Group_1 = new com.codename1.ui.ComponentGroup();
    private com.codename1.ui.TextField gui_Text_Field_2 = new com.codename1.ui.TextField();
    private com.codename1.ui.TextField gui_Text_Field_1 = new com.codename1.ui.TextField();
    private com.codename1.ui.Button gui_Button_2 = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_Button_3 = new com.codename1.ui.Button();
    private com.codename1.ui.Button gui_Button_1 = new com.codename1.ui.Button();


// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void guiBuilderBindComponentListeners() {
        EventCallbackClass callback = new EventCallbackClass();
        gui_Button_2.addActionListener(callback);
    }

    class EventCallbackClass implements com.codename1.ui.events.ActionListener, com.codename1.ui.events.DataChangedListener {
        private com.codename1.ui.Component cmp;
        public EventCallbackClass(com.codename1.ui.Component cmp) {
            this.cmp = cmp;
        }

        public EventCallbackClass() {
        }

        public void actionPerformed(com.codename1.ui.events.ActionEvent ev) {
            com.codename1.ui.Component sourceComponent = ev.getComponent();
            if(sourceComponent.getParent().getLeadParent() != null) {
                sourceComponent = sourceComponent.getParent().getLeadParent();
            }

            if(sourceComponent == gui_Button_2) {
                onButton_2ActionEvent(ev,Resources.getGlobalResources());
            }
        }

        public void dataChanged(int type, int index) {
        }
    }
    private void initGuiBuilderComponents(com.codename1.ui.util.Resources resourceObjectInstance) {
        guiBuilderBindComponentListeners();
        setLayout(new com.codename1.ui.layouts.BorderLayout());
        setTitle("Sign In");
        setName("SignInForm");
        addComponent(com.codename1.ui.layouts.BorderLayout.CENTER, gui_Container_1);
        gui_Container_1.setScrollableY(true);
        gui_Container_1.setName("Container_1");
        gui_Container_1.addComponent(gui_Label_1);
        gui_Container_1.addComponent(gui_Component_Group_1);
        gui_Component_Group_1.setName("Component_Group_1");
        gui_Component_Group_1.addComponent(gui_Text_Field_2);
        gui_Component_Group_1.addComponent(gui_Text_Field_1);
      
        gui_Text_Field_2.setName("Text_Field_2");
       
        gui_Text_Field_1.setName("Text_Field_1");
        gui_Container_1.addComponent(gui_Button_2);
        //gui_Container_1.addComponent(gui_Button_3);
        gui_Label_1.setUIID("CenterLabel");
        gui_Label_1.setName("Label_1");
        gui_Label_1.setIcon(resourceObjectInstance.getImage("profile_image.png"));
        gui_Component_Group_1.setName("Component_Group_1");
        gui_Button_2.setText("Sign In");
        gui_Button_2.setName("Button_2");
        gui_Button_3.setText("Forgot Your Password");
        gui_Button_3.setUIID("CenterLabelSmall");
        gui_Button_3.setName("Button_3");
        addComponent(com.codename1.ui.layouts.BorderLayout.SOUTH, gui_Button_1);
        gui_Container_1.setScrollableY(true);
        gui_Container_1.setName("Container_1");
        gui_Button_1.setText("Create New Account");
        gui_Button_1.setUIID("CenterLabel");
        gui_Button_1.setName("Button_1");
    }// </editor-fold>

    public void onButton_2ActionEvent(com.codename1.ui.events.ActionEvent ev,  Resources theme) {
      
        new HomePage(theme).show();
    }
}
