import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Color;

class stackqueue extends JFrame implements ActionListener
{//for stack 
int top=0,front=0,rear=0;
int countss=10,countsq=10;
JTextField counts=new JTextField("10");
JTextField jtfs[]=new JTextField[25];
JTextField jtfrs[]=new JTextField[2];		
JTextField stack=new JTextField("         \t        STACK");
JTextField sop=new JTextField("\tSTACK OPERATIONS");
JLabel cls =new JLabel("No.of Stack Fields(Max-24):");
JLabel statuss=new JLabel("STACK Status:");
JLabel pushel=new JLabel("Enter element to push:");
JLabel popel=new JLabel("Popped Element:");
JLabel popb=new JLabel("click to Pop an Element");
JLabel alerts=new JLabel("\t\tElement is  accepted");
JLabel  toploc=new JLabel("top is currently at  index :0");
JButton valds=new JButton("Validate");
JButton jbis=new JButton("PUSH");
JButton jbrs=new JButton("POP");
//JButton resets=new JButton("Reset");
JPanel lefts=new JPanel();
JPanel rights=new JPanel();
JPanel stpanel=new JPanel();


//for queues
JTextField countq=new JTextField("10");
JTextField jtfq[]=new JTextField[25];
JTextField jtfrq[]=new JTextField[2];
JTextField queue=new JTextField("         \t        QUEUE");
JTextField qop=new JTextField("\tQUEUE OPERATIONS");
JLabel statusq=new JLabel("QUEUE Status:");
JLabel alertq=new JLabel("\t\tElement is  accepted");
JLabel enqel=new JLabel("Enter element to enq:");
JLabel deqb=new JLabel("click to DeQ an Element");
JLabel deqel=new JLabel("Dequed Element:");
JLabel rearloc=new JLabel("rear is currently at  index   :0 ");
JLabel frontloc=new JLabel("front is currently at  index :0 ");
JLabel clq =new JLabel("No.of Queue Fields(Max-24):");
JButton valdq=new JButton("Validate");
JButton jbiq=new JButton("EnQ");
JButton jbrq=new JButton("DeQ");
//JButton resetq=new JButton("Reset");
JPanel leftq=new JPanel();
JPanel rightq=new JPanel();
JPanel qupanel=new JPanel();


JTabbedPane jtp=new JTabbedPane();

//initially only 10 elements stack/queue will be applied

public stackqueue()  throws Exception
{
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000,750);
		setLayout(null);
		//setSize(width,height);
		

		//initializing
		jtfrs[0]=new JTextField("");		        jtfrs[1]=new JTextField(""); 
		jtfrq[0]=new JTextField("");		        jtfrq[1]=new JTextField(""); 

		//panel adding
		stpanel.add(lefts);                	        stpanel.add(rights);
		qupanel.add(leftq);                         qupanel.add(rightq);
		jtp.addTab("STACK",stpanel);                jtp.addTab("QUEUE",qupanel);

		//setting the layout for panels individually	
		rights.setLayout(null);                     rightq.setLayout(null); 
		lefts.setLayout(new GridLayout(10,1));      leftq.setLayout(new GridLayout(10,1));
		stpanel.setLayout(new GridLayout(1,2));     qupanel.setLayout(new GridLayout(1,2));
		
		//setting bounds for panels
		lefts.setBounds(30,20,370,200);             leftq.setBounds(30,20,370,200);
		rights.setBounds(385,10,370,480);           rightq.setBounds(385,10,370,480);
		stpanel.setBounds(5,5,760,500);             qupanel.setBounds(5,5,760,500);
		jtp.setBounds(100,50,800,600);		

		//adding components/elements to the panel and JFrame
		add(jtp);
		//adding components/elements to the left panel
		for(int i=0;i<10;i++)
		{
		jtfs[i]=new JTextField("");
		lefts.add(jtfs[i]);           jtfs[i].setEditable(false);
		
		jtfq[i]=new JTextField("");
		leftq.add(jtfq[i]);           jtfq[i].setEditable(false);
		}
		stack.setEditable(false);
		queue.setEditable(false);
		sop.setEditable(false);
		qop.setEditable(false);
		//adding components/elements to the right panel   order: stack panel -queue panel
		rights.add(cls);				rightq.add(clq);
		rights.add(counts);				rightq.add(countq);
		rights.add(valds);				rightq.add(valdq);
		rights.add(stack);				rightq.add(queue);
		rights.add(sop);				rightq.add(qop);
		rights.add(pushel);				rightq.add(enqel);			
		rights.add(jtfrs[0]);	        rightq.add(jtfrq[0]);
		rights.add(jbis);				rightq.add(jbiq);
		rights.add(popb);				rightq.add(deqb);	
		rights.add(jbrs);				rightq.add(jbrq);
		rights.add(popel);			    rightq.add(deqel);			
		rights.add(jtfrs[1]);			rightq.add(jtfrq[1]);
		rights.add(statuss);			rightq.add(statusq);	
		rights.add(alerts);				rightq.add(alertq);
		rights.add(toploc);				rightq.add(rearloc);
								        rightq.add(frontloc);
	//	rights.add(resets);				rightq.add(resetq);

		//adding bounds to  components/elements in the right panel   order: stack panel -queue panel
		stack.setBounds(35,30,300,60);		queue.setBounds(35,30,300,60);
	    cls.setBounds(35,120,160,40);		clq.setBounds(35,120,160,40);
		
		counts.setBounds(200,120,60,40);	countq.setBounds(200,120,60,40);
		valds.setBounds(270,120,100,40);	valdq.setBounds(270,120,100,40);
		sop.setBounds(35,170,300,40);		qop.setBounds(35,170,300,40);
		pushel.setBounds(50,225,150,25);	enqel.setBounds(50,225,150,25);
		jtfrs[0].setBounds(50,260,100,25);	jtfrq[0].setBounds(50,260,100,25);
		jbis.setBounds(200,260,100,25);		jbiq.setBounds(200,260,100,25);
        popb.setBounds(50,300,140,25);		deqb.setBounds(50,300,140,25);
		jbrs.setBounds(200,300,100,25);		jbrq.setBounds(200,300,100,25);
		popel.setBounds(50,340,100,25);		deqel.setBounds(50,340,100,25);
		jtfrs[1].setBounds(200,340,100,25);	jtfrq[1].setBounds(200,340,100,25);
		statuss.setBounds(135,470,100,50);	statusq.setBounds(135,470,100,50);
		alerts.setBounds(120,500,150,45);	alertq.setBounds(120,500,150,45);
		toploc.setBounds(50,375,250,25);    rearloc.setBounds(50,375,250,25);
							 				frontloc.setBounds(50,405,250,25);
		//resets.setBounds(330,475,70,20);    resetq.setBounds(330,475,70,20);									 
											

		//adding action listener
		jbis.addActionListener(this);
		jbrs.addActionListener(this);
		jbiq.addActionListener(this);
		jbrq.addActionListener(this);
		valds.addActionListener(this);
		valdq.addActionListener(this);
		// resets.addActionListener(this);
		// resetq.addActionListener(this);
			setVisible(true);


}
	public void actionPerformed(ActionEvent ae)
	{ countss=Integer.parseInt(counts.getText());
	  countsq=Integer.parseInt(countq.getText());

		if(ae.getSource()==jbis)   //for push
		{
			if(top>countss-1)
				{alerts.setText("Stack is Full"); alerts.setForeground(Color.RED);}
			else
			{	if(top<0)
					top=0;
				jtfs[top].setText(jtfrs[0].getText());
				//jtfrs[0].setText("");
				top++;				
				toploc.setText("top is currently at  index :"+top);
				alerts.setText("Element Accepted"); alerts.setForeground(Color.BLACK);
			}
		}
		else if(ae.getSource()==jbrs)  //for pop
		{  
			if(top<0)
				{alerts.setText("Stack is Empty");alerts.setForeground(Color.RED);}
			else
			{	if(top>countss-1)
					top=countss-1;
				jtfrs[1].setText(jtfs[top].getText());
				jtfs[top].setText("");
				top--;				
				toploc.setText("top is currently at  index :"+top);
			}	
		
		}
		else if(ae.getSource()==jbiq)  //for queue  insert-enque
		{	if(rear==front)
					{front=0;rear=0;}
			if(rear>countsq)
				{alertq.setText("Queue is Full"); alertq.setForeground(Color.RED);}
			else
			{	
				
				jtfq[rear].setText(jtfrq[0].getText());	
				//jtfrq[0].setText("");
				rear++;
				rearloc.setText("rear is currently at  index   :"+rear);
				frontloc.setText("front is currently at  index :"+front);
				alertq.setText("Element Accepted"); alertq.setForeground(Color.BLACK);
			}
		}
		else if(ae.getSource()==jbrq)  //for queue delete -deque
		{
			if(front==rear)
				{alertq.setText("Queue is Empty");alertq.setForeground(Color.RED);}
			else
			{	if(front!=0 && rear==front)
				{
					front=0; rear=0;
				}
				
				jtfrq[1].setText(jtfq[front].getText());
				jtfq[front].setText("");
				front++;
				rearloc.setText("rear is currently at index  :"+rear);
				frontloc.setText("front is currently at index:"+front);
			}
		}
		else if(ae.getSource()==valds) //validate no of max-elements stack
		{	lefts.removeAll();
			lefts.revalidate();		 	
			lefts.repaint();
			countss=Integer.parseInt(counts.getText());
			lefts.setLayout(new GridLayout(countss,1));
			for(int x=0;x<countss;x++)
				{
					try
					{ 
						jtfs[x]=new JTextField("");
						jtfs[x].setEditable(false);
						lefts.add(jtfs[x]);
					}
					catch(Exception aa)
					{
							aa.printStackTrace();
							
					}
				}
				
			lefts.revalidate();
			lefts.repaint();
		}
		else if(ae.getSource()==valdq)//validate no of max-elements queue
		{
			leftq.removeAll();
			leftq.revalidate();		 	
			leftq.repaint();
			countsq=Integer.parseInt(countq.getText());
			leftq.setLayout(new GridLayout(countsq,1));
			for(int x=0;x<countsq;x++)
				{
					try
					{ 
						jtfq[x]=new JTextField("");
						jtfq[x].setEditable(false);
						leftq.add(jtfq[x]);
					}
					catch(Exception aa)
					{
							aa.printStackTrace();
							
					}
				}
				
			lefts.revalidate();
			lefts.repaint();


		}
	}
        public static void main(String []args)
	{
		try{
			//object of tabn class
			new stackqueue();
		}
		catch(Exception a)
		{a.printStackTrace();}   
	}

}