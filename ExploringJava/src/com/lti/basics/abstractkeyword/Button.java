package com.lti.basics.abstractkeyword;

public class Button extends Component {

	private String label;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public void draw() {
		int sp = getWidth() - getLabel().length()/2 - 2;

		for(int i = 0; i < getWidth(); i++)
			System.out.print("-");
		System.out.println();
		
		System.out.print("|");
		
		for(int i = 0; i < sp; i++)
			System.out.print(" ");
		
		System.out.print(getLabel());
		
		for(int i = 0; i < sp; i++)
			System.out.print(" ");
		
		System.out.print("|");
		System.out.println();

		for(int i = 0; i < getWidth(); i++)
			System.out.print("-");
	}

	
}
