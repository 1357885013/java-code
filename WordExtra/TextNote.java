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
    private MenuItem closeItem, openItem, openFoldItem, saveItem, subItem1, subItem, extraFile, extraFold, extraTextArea, endExtra;
    private FileDialog openDialog, saveDialog;

    private TextArea textArea;
    private File file, dir;

    private TextNote() {
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

        MenuBar menuBar = new MenuBar();
        Menu menu = new Menu("file");

        closeItem = new MenuItem("exit");
        openItem = new MenuItem("open");
        openFoldItem = new MenuItem("open fold");
        saveItem = new MenuItem("save");

        Menu subMenu = new Menu("new");
        subItem1 = new MenuItem("Web Project");
        subItem = new MenuItem("Java Project");
        subMenu.add(subItem);
        subMenu.add(subItem1);
        menu.add(subMenu);

        menu.add(openItem);
        menu.add(openFoldItem);
        menu.add(saveItem);
        menu.add(closeItem);
        menuBar.add(menu);

        Menu menuExtra = new Menu("Extra words");
        extraFile = new MenuItem("extra file");
        extraFold = new MenuItem("extra fold");
        extraTextArea = new MenuItem("extra the content which in text area");
        endExtra = new MenuItem("end extra");
        menuExtra.add(extraFile);
        menuExtra.add(extraFold);
        menuExtra.add(extraTextArea);
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
        //解析文件
        extraFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wordExtra extra = new wordExtra();
                textArea.setRows(0);
                textArea.append(openFold.readFile(openFold.selectFile(openDialog)) + "\n");
                wordExtra.s.clear();
                extra.extra(textArea.getText());
                textArea.append(wordExtra.s.toString() + "\n");
            }
        });
        //解析目录
        extraFold.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wordExtra.s.clear();
                File fold = openFold.selectFold();
                textArea.append("Extra fold : " + fold.toString() + "\n");
                int count = openFold.listDirectory(fold);
                textArea.append(wordExtra.s.toString() + "\n");
                textArea.append("words count = " + wordExtra.s.size() + "\n");
                textArea.append("file count = " + count + "\n\n\n");
            }
        });
        //解析文件
        extraTextArea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wordExtra extra = new wordExtra();
                textArea.setRows(0);
                wordExtra.s.clear();
                extra.extra(textArea.getText());
                textArea.append(wordExtra.s.toString() + "\n");
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
                dir = null;
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

        //打开目录
        openFoldItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                openFold.listDirectory(openFold.selectFold());
                textArea.append(wordExtra.s.toString());
                System.out.println("done");
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

