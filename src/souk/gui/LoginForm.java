/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package souk.gui;

import com.codename1.components.FloatingHint;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.NetworkEvent;
import com.codename1.io.NetworkManager;
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

import com.codename1.ui.TextField;
import com.codename1.ui.Container;

import com.codename1.ui.events.ActionListener;
import com.codename1.ui.events.DataChangedListener;
import com.codename1.ui.util.Resources;

import souk.entite.User;
import souk.services.UserServices;
import souk.util.SessionUser;

/**
 *
 * @author HAYFA
 */
public class LoginForm extends Form {
//-- DON'T EDIT BELOW THIS LINE!!!

    private Container gui_Container_1 = new Container(new BoxLayout(BoxLayout.Y_AXIS));
    private Label gui_Label_1 = new Label();
    private ComponentGroup gui_Component_Group_1 = new ComponentGroup();
    private TextField txtlogin = new TextField();
    private TextField txtPassword = new TextField();
    private Button btnSignIn = new Button();
    //private Button gui_Button_3 = new Button();
    private Button btnSignup = new Button();

    public LoginForm(Resources theme) {
        initGuiBuilderComponents(Resources.getGlobalResources());
        getTitleArea().setUIID("Container");
        getToolbar().setUIID("Container");
        getToolbar().getTitleComponent().setUIID("SigninTitle");
        FontImage mat = FontImage.createMaterial(FontImage.MATERIAL_CLOSE, "SigninTitle", 3.5f);
        getToolbar().addCommandToLeftBar("", mat, e -> new HomePage(Resources.getGlobalResources()).show());
        getContentPane().setUIID("SignInForm");
    }

// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
//    private void guiBuilderBindComponentListeners() {
//        EventCallbackClass callback = new EventCallbackClass();
//        btnSignIn.addActionListener(callback);
//    }
//
//    class EventCallbackClass implements ActionListener, DataChangedListener {
//
//        private com.codename1.ui.Component cmp;
//
//        public EventCallbackClass(com.codename1.ui.Component cmp) {
//            this.cmp = cmp;
//        }
//
//        public EventCallbackClass() {
//        }
//
//        public void actionPerformed(com.codename1.ui.events.ActionEvent ev) {
//            com.codename1.ui.Component sourceComponent = ev.getComponent();
//            if (sourceComponent.getParent().getLeadParent() != null) {
//                sourceComponent = sourceComponent.getParent().getLeadParent();
//            }
//
//            if (sourceComponent == btnSignIn) {
//                onbtnSignInActionEvent(ev, Resources.getGlobalResources());
//            }
//        }
//
//        public void dataChanged(int type, int index) {
//        }
//    }
    private void initGuiBuilderComponents(Resources theme) {
        //guiBuilderBindComponentListeners();
        setLayout(new com.codename1.ui.layouts.BorderLayout());
        setTitle("Sign In");
        setName("SignInForm");
        addComponent(com.codename1.ui.layouts.BorderLayout.CENTER, gui_Container_1);
        gui_Container_1.setScrollableY(true);
        gui_Container_1.setName("Container_1");
        gui_Container_1.addComponent(gui_Label_1);
        gui_Container_1.addComponent(gui_Component_Group_1);
        gui_Component_Group_1.setName("Component_Group_1");
        gui_Component_Group_1.addComponent(txtlogin);
        gui_Component_Group_1.addComponent(txtPassword);

        txtlogin.setName("txtlogin");

        txtPassword.setName("txtPassword");
        gui_Container_1.addComponent(btnSignIn);
        //gui_Container_1.addComponent(gui_Button_3);
        gui_Label_1.setUIID("CenterLabel");
        gui_Label_1.setName("Label_1");
        gui_Label_1.setIcon(theme.getImage("logo.png"));
        gui_Component_Group_1.setName("Component_Group_1");
        btnSignIn.setText("Sign In");
        btnSignIn.setName("btnSignIn");
        //"Button_2"
//        gui_Button_3.setText("Forgot Your Password");
//        gui_Button_3.setUIID("CenterLabelSmall");
//        gui_Button_3.setName("Button_3");

        gui_Container_1.setScrollableY(true);
        gui_Container_1.setName("Container_1");
        btnSignup.setText("Create New Account");
        btnSignup.setUIID("CenterLabel");
        btnSignup.setName("btnSignup");
        gui_Container_1.addComponent(btnSignup);
        ////login action
        btnSignIn.addActionListener((e) -> {
            UserServices ser = new UserServices();
            ConnectionRequest con = new ConnectionRequest();
            String Url = "http://localhost:8000/app_dev.php/api/user/" + getTxtlogin().getText() + "/" + getTxtPassword().getText();
            System.out.println("" + Url);
            con.setUrl(Url);
            NetworkManager.getInstance().addToQueue(con);
            con.addResponseListener(new ActionListener<NetworkEvent>() {

                @Override
                public void actionPerformed(NetworkEvent evt) {
                    UserServices ser = new UserServices();

                    User u = ser.getUserConnecte(new String(con.getResponseData()));
                     SessionUser.setInstance(u);
                    new   HomePage(theme).show();
                }
            });

            
        });
    }

    public TextField getTxtlogin() {
        return txtlogin;
    }

    public void setTxtlogin(TextField txtlogin) {
        this.txtlogin = txtlogin;
    }

    public TextField getTxtPassword() {
        return txtPassword;
    }

    public void setTxtPassword(TextField txtPassword) {
        this.txtPassword = txtPassword;
    }

}
