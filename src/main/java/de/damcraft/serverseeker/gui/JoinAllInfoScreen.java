package de.damcraft.serverseeker.gui;

import de.damcraft.serverseeker.JoinAll;
import meteordevelopment.meteorclient.gui.GuiTheme;
import meteordevelopment.meteorclient.gui.GuiThemes;
import meteordevelopment.meteorclient.gui.WindowScreen;
import meteordevelopment.meteorclient.gui.widgets.WWidget;
import meteordevelopment.meteorclient.gui.widgets.containers.WHorizontalList;
import meteordevelopment.meteorclient.gui.widgets.containers.WVerticalList;
import meteordevelopment.meteorclient.gui.widgets.pressable.WButton;
import meteordevelopment.meteorclient.gui.widgets.pressable.WCheckbox;

public class JoinAllInfo extends WindowScreen {
    public JoinAllInfo() {
        super(GuiThemes.get(), "Join All");
    }

    @Override
    public void initWidgets() {
        add(theme.label("How to use 'Join All'"));
        add(theme.label("- To join the next server, use '.ja next'"));
        add(theme.label("- To join the previous server, use '.ja prev'"));
        add(theme.label("- To join a random server, use '.ja rand'"));
        add(theme.label("- If you want to stop, disconnect"));
        WVerticalList doNotShowAgainList = add(theme.verticalList()).widget();
        doNotShowAgainList.add(theme.label("Do not show again")).expandX();
        WCheckbox doNotShowAgain = doNotShowAgainList.add(theme.checkbox(false)).widget();
        WButton start = add(theme.button("Start!")).widget();
        start.action = JoinAll::joinNextServer;
    }
}
