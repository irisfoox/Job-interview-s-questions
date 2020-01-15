package RandMusic;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Musical[] inst=new Musical[5];
    Violin violin=new Violin("violin",false,true);
    inst[0]=violin;
    Guitar gui=new Guitar("guitar",false,true);
    inst[1]=gui;
    Trump trump=new Trump("trump",true,false);
    inst[2]=trump;
    Piano pia=new Piano("piano",true,false);
    inst[3]=pia;
    Drums drum=new Drums("drums",false,false);
    inst[4]=drum;
    for(int i=0;i<4;i++) {
    	Musical m=(Musical)(inst[getNum()]);
    	System.out.print(m.getName()+" ");
    	m.sound();
    }
	}
    public static int getNum() {
        int a=0;
      	for(int i=0;i<30;i++)
    	a=(int)(Math.random()*10);
    	if (a<5) { 
    		return a;
    	}
     		return a-5;
}
}

