package russianbar;

import com.intellij.ide.ui.LafManager;
import com.intellij.ide.ui.LafManagerListener;
import com.intellij.openapi.application.ApplicationActivationListener;
import com.intellij.openapi.application.ApplicationListener;
import com.intellij.openapi.wm.IdeFrame;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class RussianApplicationComponent implements LafManagerListener, ApplicationActivationListener {
    public RussianApplicationComponent() {
        updateProgressBarUi();
    }

    @Override
    public void lookAndFeelChanged(@NotNull LafManager lafManager) {
        updateProgressBarUi();
    }

    @Override
    public void applicationActivated(@NotNull IdeFrame ideFrame) {
        updateProgressBarUi();
    }
    private void updateProgressBarUi() {
        UIManager.put("ProgressBarUI", RussianProgressBarUi.class.getName());
        UIManager.getDefaults().put(RussianProgressBarUi.class.getName(), RussianProgressBarUi.class);
    }
}
