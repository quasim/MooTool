package com.luoboduner.moo.tool.ui.form.func;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import com.luoboduner.moo.tool.App;
import com.luoboduner.moo.tool.util.UndoUtil;
import lombok.Getter;

import javax.swing.*;
import java.awt.*;

/**
 * <pre>
 * 编码转换
 * </pre>
 *
 * @author <a href="https://github.com/rememberber">RememBerBer</a>
 * @since 2019/9/9.
 */
@Getter
public class EnCodeForm {
    private JTabbedPane tabbedPane1;
    private JPanel enCodePanel;
    private JTextArea nativeTextArea;
    private JTextArea unicodeTextArea;
    private JButton nativeToUnicodeButton;
    private JButton unicodeToNativeButton;
    private JTextArea urlTextArea;
    private JTextArea urlEncodeTextArea;
    private JButton urlEncodeButton;
    private JButton urlDecodeButton;
    private JComboBox urlEncodeCharsetComboBox;

    private static EnCodeForm enCodeForm;

    private EnCodeForm() {
        UndoUtil.register(this);
    }

    public static EnCodeForm getInstance() {
        if (enCodeForm == null) {
            enCodeForm = new EnCodeForm();
        }
        return enCodeForm;
    }

    public static void init() {
        enCodeForm = getInstance();
        initUi();
    }

    private static void initUi() {
        if ("Darcula(推荐)".equals(App.config.getTheme())) {
            Color bgColor = new Color(30, 30, 30);
            Color foreColor = new Color(187, 187, 187);
            enCodeForm.getNativeTextArea().setBackground(bgColor);
            enCodeForm.getNativeTextArea().setForeground(foreColor);

            enCodeForm.getUnicodeTextArea().setBackground(bgColor);
            enCodeForm.getUnicodeTextArea().setForeground(foreColor);

            enCodeForm.getUrlTextArea().setBackground(bgColor);
            enCodeForm.getUrlTextArea().setForeground(foreColor);

            enCodeForm.getUrlEncodeTextArea().setBackground(bgColor);
            enCodeForm.getUrlEncodeTextArea().setForeground(foreColor);
        }
        enCodeForm.getEnCodePanel().updateUI();
    }


    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        enCodePanel = new JPanel();
        enCodePanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        tabbedPane1 = new JTabbedPane();
        enCodePanel.add(tabbedPane1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(200, 200), null, 0, false));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));
        tabbedPane1.addTab("Native/Unicode", panel1);
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayoutManager(4, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel1.add(panel2, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        nativeToUnicodeButton = new JButton();
        nativeToUnicodeButton.setText("Native --> Unicode");
        panel2.add(nativeToUnicodeButton, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        unicodeToNativeButton = new JButton();
        unicodeToNativeButton.setText("Native <-- Unicode");
        panel2.add(unicodeToNativeButton, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        panel2.add(spacer1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer2 = new Spacer();
        panel2.add(spacer2, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final JScrollPane scrollPane1 = new JScrollPane();
        panel1.add(scrollPane1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        nativeTextArea = new JTextArea();
        scrollPane1.setViewportView(nativeTextArea);
        final JScrollPane scrollPane2 = new JScrollPane();
        panel1.add(scrollPane2, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        unicodeTextArea = new JTextArea();
        scrollPane2.setViewportView(unicodeTextArea);
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayoutManager(1, 3, new Insets(0, 0, 0, 0), -1, -1));
        tabbedPane1.addTab("URL转码", panel3);
        urlTextArea = new JTextArea();
        panel3.add(urlTextArea, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        urlEncodeTextArea = new JTextArea();
        panel3.add(urlEncodeTextArea, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        final JPanel panel4 = new JPanel();
        panel4.setLayout(new GridLayoutManager(5, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel3.add(panel4, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        urlEncodeButton = new JButton();
        urlEncodeButton.setIcon(new ImageIcon(getClass().getResource("/icon/arrow-right.png")));
        urlEncodeButton.setText("Encode编码");
        panel4.add(urlEncodeButton, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        urlDecodeButton = new JButton();
        urlDecodeButton.setIcon(new ImageIcon(getClass().getResource("/icon/arrow-left.png")));
        urlDecodeButton.setText("Decode解码");
        panel4.add(urlDecodeButton, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer3 = new Spacer();
        panel4.add(spacer3, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer4 = new Spacer();
        panel4.add(spacer4, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        urlEncodeCharsetComboBox = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        defaultComboBoxModel1.addElement("utf-8");
        defaultComboBoxModel1.addElement("gb2312");
        urlEncodeCharsetComboBox.setModel(defaultComboBoxModel1);
        panel4.add(urlEncodeCharsetComboBox, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return enCodePanel;
    }

}
