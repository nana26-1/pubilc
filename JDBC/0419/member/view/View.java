package miniProj_0417.member.view;

import javax.swing.JPanel;

import miniProj_0417.member.resource.R;


public abstract class View extends JPanel implements R{
	abstract void display();
	abstract void evt();
}