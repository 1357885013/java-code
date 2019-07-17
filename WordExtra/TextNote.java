package WordExtra;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;

/**
 * 实现菜单栏
 */
public class TextNote {
    private Frame frame;
    private MenuBar menuBar;
    private Menu menu, subMenu,menuExtra;
    private MenuItem closeItem, openItem, saveItem, subItem1, subItem,beginExtra,endExtra;
    private FileDialog openDialog, saveDialog;
    private TextArea textArea;
    private File file;

    TextNote() {
        init();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new TextNote();
    }

    private void init() {
        frame = new Frame("word Exract");
        frame.setBounds(300, 100, 800, 500);
        //frame.setLayout();

        menuBar = new MenuBar();
        menu = new Menu("file");

        closeItem = new MenuItem("exit");
        openItem = new MenuItem("open");
        saveItem = new MenuItem("save");

        subMenu = new Menu("new");
        subItem1 = new MenuItem("Web Project");
        subItem = new MenuItem("Java Project");
        subMenu.add(subItem);
        subMenu.add(subItem1);

        menu.add(subMenu);
        menu.add(openItem);
        menu.add(saveItem);
        menu.add(closeItem);
        menuBar.add(menu);

        menuExtra = new Menu("Extra words");
        beginExtra = new MenuItem("begin extra words");
        endExtra = new MenuItem("end extra words");
        menuExtra.add(beginExtra);
        menuExtra.add(endExtra);
        menuBar.add(menuExtra);

        openDialog = new FileDialog(frame, "我要打开", FileDialog.LOAD);
        saveDialog = new FileDialog(frame, "我要保存", FileDialog.SAVE);

        textArea = new TextArea();

        frame.add(textArea);
        frame.setMenuBar(menuBar);
        myEvent();

        frame.setVisible(true);
    }

    private void myEvent() {

        beginExtra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wordExtra.begin(textArea);
            }
        });

        endExtra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        saveItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if (file == null) {
                    saveDialog.setVisible(true);
                    String dirPath = saveDialog.getDirectory();
                    String fileName = saveDialog.getFile();
                    if (dirPath == null || fileName == null)
                        return;
                    file = new File(dirPath, fileName);
                }
                try {
                    BufferedWriter bufw = new BufferedWriter(new FileWriter(file));
                    String text = textArea.getText();
                    bufw.write(text);
                    bufw.close();
                } catch (IOException e2) {
                    throw new RuntimeException("保存失败");
                }
            }
        });

        //打开菜单
        openItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                openDialog.setVisible(true);
                String dirPath = openDialog.getDirectory();
                String fileName = openDialog.getFile();
                System.out.println(dirPath + "...." + fileName);
                if (dirPath == null || fileName == null)
                    return;
                textArea.setText("");
                file = new File(dirPath, fileName);
                try {
                    BufferedReader bufr = new BufferedReader(new FileReader(file));
                    String line = null;
                    while ((line = bufr.readLine()) != null) {
                        textArea.append(line + "\r\n");

                    }
                    bufr.close();
                } catch (IOException e2) {
                    throw new RuntimeException("打开异常");
                }

            }
        });

        closeItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                System.exit(0);
            }
        });

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

