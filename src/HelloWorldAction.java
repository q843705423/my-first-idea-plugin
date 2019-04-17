import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.editor.Document;



public class HelloWorldAction extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {


        UI ui = new UI();
        ui.pack();
        ui.setVisible(true);

    }
    // 弹窗显示消息
//        Messages.showMessageDialog("", "ShuoGG Say", Messages.getInformationIcon());
}

