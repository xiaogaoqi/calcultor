package com.example.huzi;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends ActionBarActivity {

	//按钮（结果，清空，退出）
	private Button jsBtn,reset,exit;
	//输入框（活鸟，拖鸟，胡息，彩头）
	private EditText jiaHuoNiao,yiHuoNiao,binHuoNiao,dingHuoNiao,jiaTuoNiao,yiTuoNiao,binTuoNiao,dingTuoNiao,jiaHuXi,yiHuXi,binHuXi,dingHuXi,
		caiTuo;
	//结果
	private TextView jiaJieGuo,yiJieGuo,binJieGuo,dingJieGuo;
	//输入的彩头
	private double doubleCaiTuo;
	//输入的（活鸟，拖鸟，胡息）
	private int intjiaHuoNiao,intyiHuoNiao,intbinHuoNiao,intdingHuoNiao,intjiaTuoNiao,intyiTuoNiao,intbinTuoNiao,intdingTuoNiao,intjiaHuXi,intyiHuXi,intbinHuXi,intdingHuXi;
   
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //定义按钮
        jsBtn = (Button) findViewById(R.id.jsBtn);
        reset = (Button) findViewById(R.id.reset);
        exit = (Button) findViewById(R.id.exit);
        
        //定义活鸟
        jiaHuoNiao = (EditText) findViewById(R.id.jiaHuoNiao);
        yiHuoNiao = (EditText) findViewById(R.id.yiHuoNiao);
        binHuoNiao = (EditText) findViewById(R.id.binHuoNiao);
        dingHuoNiao = (EditText) findViewById(R.id.dingHuoNiao);
        
        //定义拖鸟
        jiaTuoNiao = (EditText) findViewById(R.id.jiaTuoNiao);
        yiTuoNiao = (EditText) findViewById(R.id.yiTuoNiao);
        binTuoNiao = (EditText) findViewById(R.id.binTuoNiao);
        dingTuoNiao = (EditText) findViewById(R.id.dingTuoNiao);
        
        //定义胡息
        jiaHuXi = (EditText) findViewById(R.id.jiaHuXi);
        yiHuXi = (EditText) findViewById(R.id.yiHuXi);
        binHuXi = (EditText) findViewById(R.id.binHuXi);
        dingHuXi = (EditText) findViewById(R.id.dingHuXi);
        
        //定义彩头
        caiTuo = (EditText) findViewById(R.id.caiTuo);
        
        //定义结果
        jiaJieGuo = (TextView) findViewById(R.id.jiaJieGuo);
        yiJieGuo = (TextView) findViewById(R.id.yiJieGuo);
        binJieGuo = (TextView) findViewById(R.id.binJieGuo);
        dingJieGuo = (TextView) findViewById(R.id.dingJieGuo);
        
        jsBtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				jiaJieGuo.setText(null);
				yiJieGuo.setText(null);
				binJieGuo.setText(null);
				dingJieGuo.setText(null);
				//Resout();
				FourPerson();
			}
		});
        
        reset.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				jiaHuoNiao.setText(null);
				yiHuoNiao.setText(null);
				binHuoNiao.setText(null);
				dingHuoNiao.setText(null);
				jiaTuoNiao.setText(null);
				yiTuoNiao.setText(null);
				binTuoNiao.setText(null);
				dingTuoNiao.setText(null);
				jiaHuXi.setText(null);
				yiHuXi.setText(null);
				binHuXi.setText(null);
				dingHuXi.setText(null);
				jiaJieGuo.setText("0");
				yiJieGuo.setText("0");
				binJieGuo.setText("0");
				dingJieGuo.setText("0");
				caiTuo.setText(null);
			}
		});
        
        exit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				finish();
			}
		});
    }
	
	 public double Mathrint(double x){
	        if(x<0){
	            double xd=x-(int)(x);
	            double	tmp=0.0;
	            xd =-xd;
	            if(xd>0.4){
	                tmp=	Math.round(xd);
	            }
	            x=(int)x-tmp;
	        }else{
	            x=	Math.round(x);
	        }
	        return x*10.0;

	    }
	
//	public void Resout(){
//		//活鸟值
//		intjiaHuoNiao = Integer.parseInt(jiaHuoNiao.getText().toString());
//		intyiHuoNiao = Integer.parseInt(yiHuoNiao.getText().toString());
//		intbinHuoNiao = Integer.parseInt(binHuoNiao.getText().toString());
//		intdingHuoNiao = Integer.parseInt(dingHuoNiao.getText().toString());
//		
//		//拖鸟值
//		intjiaTuoNiao = Integer.parseInt(jiaTuoNiao.getText().toString());
//		intyiTuoNiao = Integer.parseInt(yiTuoNiao.getText().toString());
//		intbinTuoNiao = Integer.parseInt(binTuoNiao.getText().toString());
//		intdingTuoNiao = Integer.parseInt(dingTuoNiao.getText().toString());
//		
//		//胡息
//		intjiaHuXi = Integer.parseInt(jiaHuXi.getText().toString());
//		intyiHuXi = Integer.parseInt(yiHuXi.getText().toString());
//		intbinHuXi = Integer.parseInt(binHuXi.getText().toString());
//		intdingHuXi = Integer.parseInt(dingHuXi.getText().toString());
//		
//		//彩头
//		doubleCaiTuo = Double.parseDouble(caiTuo.getText().toString());
//		
//		  //拖鸟结果值
//        int[] Rtn = {0,0,0,0};
//
//        int[] hz = {intjiaHuXi, intyiHuXi, intbinHuXi,intdingHuXi};
//        int[] tn = {intjiaTuoNiao, intyiTuoNiao, intbinTuoNiao,intdingTuoNiao};
//        int rs = 0;
//        for (int i = 0; i < tn.length; i++) {
//            for (int j = 0; j < tn.length; j++) {
//                if (i != j) {
//                    if (hz[i] - hz[j] > 0) {
//                        rs += tn[i] + tn[j];
//                    } else if(hz[i] - hz[j]==0){
//                        rs+=0;
//                    }else{
//                        rs += (-tn[i] - tn[j]);
//                    }
//                }
//            }
//
//            Rtn[i]=rs;
//            rs = 0;
//        }
//
//        intjiaHuXi = (int) Mathrint(intjiaHuXi / 10.0);
//        intyiHuXi = (int) Mathrint(intyiHuXi / 10.0);
//        intbinHuXi = (int) Mathrint(intbinHuXi / 10.0);
//        intdingHuXi = (int) Mathrint(intdingHuXi / 10.0);
//
//        //胡子的重新赋值
//        hz[0] = intjiaHuXi;
//        hz[1] = intyiHuXi;
//        hz[2] = intbinHuXi;
//        hz[3] = intdingHuXi;
//
//        int[] hn = {intjiaHuoNiao, intyiHuoNiao, intbinHuoNiao,intdingHuoNiao};
//        //活鸟结果值
//        int[] Rhn = {0,0,0,0};
//        rs = 0;
//        for (int i = 0; i < tn.length; i++) {
//            for (int j = 0; j < tn.length; j++) {
//                if (i != j) {
//                    rs += ((hz[i] - hz[j]) * doubleCaiTuo * (hn[i] + 1) * (hn[j] + 1));
//                }
//
//            }
//            Rhn[i]=rs;
//            rs = 0;
//        }
//
//        int Rrs11=Rhn[0] + Rtn[0];
//        String Rrs1 = Integer.toString(Rrs11);
//        jiaJieGuo.setText(Rrs1);
//        int Rrs22=Rhn[1] + Rtn[1];
//        String Rrs2 = Integer.toString(Rrs22);
//        yiJieGuo.setText(Rrs2);
//        int Rrs33=Rhn[2] + Rtn[2];
//        String Rrs3 =  Integer.toString(Rrs33);
//        binJieGuo.setText(Rrs3);
//        int Rrs44=Rhn[3] + Rtn[3];
//        String Rrs4 =  Integer.toString(Rrs44);
//        dingJieGuo.setText(Rrs4);
//	}
	
	 public void FourPerson() {
	        try {
	            //菜头
	        	doubleCaiTuo = Double.parseDouble(caiTuo.getText().toString());
	       
	        } catch (Exception e) {
	            e.printStackTrace();
	            doubleCaiTuo = 0;
	        }
	        //积分
	        try {
	        	intjiaHuXi = Integer.parseInt(jiaHuXi.getText().toString());
	        } catch (Exception e) {
	            e.printStackTrace();
	            intjiaHuXi = 0;
	        }
	        try {
	        	intyiHuXi = Integer.parseInt(yiHuXi.getText().toString());
	        } catch (Exception e) {
	            e.printStackTrace();
	            intyiHuXi = 0;
	        }
	        try {
	        	intbinHuXi = Integer.parseInt(binHuXi.getText().toString());
	        } catch (Exception e) {
	            e.printStackTrace();
	            intbinHuXi = 0;
	        }
	        try {
	        	intdingHuXi = Integer.parseInt(dingHuXi.getText().toString());
	        } catch (Exception e) {
	            e.printStackTrace();
	            intdingHuXi = 0;
	        }
	        //活鸟
	        try {
	        	intjiaHuoNiao = Integer.parseInt(jiaHuoNiao.getText().toString());
	        } catch (Exception e) {
	            e.printStackTrace();
	            intjiaHuoNiao = 0;
	        }
	        try {
	        	intyiHuoNiao = Integer.parseInt(yiHuoNiao.getText().toString());
	        } catch (Exception e) {
	            e.printStackTrace();
	            intyiHuoNiao = 0;
	        }
	        try {
	        	intbinHuoNiao = Integer.parseInt(binHuoNiao.getText().toString());
	        } catch (Exception e) {
	            e.printStackTrace();
	            intbinHuoNiao = 0;
	        }
	        try {
	        	intdingHuoNiao = Integer.parseInt(dingHuoNiao.getText().toString());
	        } catch (Exception e) {
	            e.printStackTrace();
	            intdingHuoNiao = 0;
	        }
	        //拖鸟
	        try {
	        	intjiaTuoNiao = Integer.parseInt(jiaTuoNiao.getText().toString());
	        } catch (Exception e) {
	            e.printStackTrace();
	            intjiaTuoNiao = 0;
	        }
	        try {
	        	intyiTuoNiao = Integer.parseInt(yiTuoNiao.getText().toString());
	        } catch (Exception e) {
	            e.printStackTrace();
	            intyiTuoNiao = 0;
	        }
	        try {
	        	intbinTuoNiao = Integer.parseInt(binTuoNiao.getText().toString());
	        } catch (Exception e) {
	            e.printStackTrace();
	            intbinTuoNiao = 0;
	        }
	        try {
	        	intdingTuoNiao = Integer.parseInt(dingTuoNiao.getText().toString());
	        } catch (Exception e) {
	            e.printStackTrace();
	            intdingTuoNiao = 0;
	        }


	        //拖鸟结果值
	        int[] Rtn = {0,0,0,0};

	        int[] hz = {intjiaHuXi, intyiHuXi, intbinHuXi,intdingHuXi};
	        int[] tn = {intjiaTuoNiao, intyiTuoNiao, intbinTuoNiao,intdingTuoNiao};
	        int rs = 0;
	        for (int i = 0; i < tn.length; i++) {
	            for (int j = 0; j < tn.length; j++) {
	                if (i != j) {
	                    if (hz[i] - hz[j] > 0) {
	                        rs += tn[i] + tn[j];
	                    } else if(hz[i] - hz[j]==0){
	                        rs+=0;
	                    }else{
	                        rs += (-tn[i] - tn[j]);
	                    }
	                }
	            }

	            Rtn[i]=rs;
	            rs = 0;
	        }

	        intjiaHuXi = (int) Mathrint(intjiaHuXi / 10.0);
	        intyiHuXi = (int) Mathrint(intyiHuXi / 10.0);
	        intbinHuXi = (int) Mathrint(intbinHuXi / 10.0);
	        intdingHuXi = (int) Mathrint(intdingHuXi / 10.0);

	        //胡子的重新赋值
	        hz[0] = intjiaHuXi;
	        hz[1] = intyiHuXi;
	        hz[2] = intbinHuXi;
	        hz[3] = intdingHuXi;

	        int[] hn = {intjiaHuoNiao, intyiHuoNiao, intbinHuoNiao,intdingHuoNiao};
	        //活鸟结果值
	        int[] Rhn = {0,0,0,0};
	        rs = 0;
	        for (int i = 0; i < tn.length; i++) {
	            for (int j = 0; j < tn.length; j++) {
	                if (i != j) {
	                    rs += ((hz[i] - hz[j]) * doubleCaiTuo * (hn[i] + 1) * (hn[j] + 1));
	                }

	            }
	            Rhn[i]=rs;
	            rs = 0;
	        }

	        int Srs11=Rhn[0] + Rtn[0];
	        String Srs1 = Integer.toString(Srs11);
	        jiaJieGuo.setText(Srs1);
	        int Srs22=Rhn[1] + Rtn[1];
	        String Srs2 = Integer.toString(Srs22);
	        yiJieGuo.setText(Srs2);
	        int Srs33=Rhn[2] + Rtn[2];
	        String Srs3 =  Integer.toString(Srs33);
	        binJieGuo.setText(Srs3);
	        int Srs44=Rhn[3] + Rtn[3];
	        String Srs4 =  Integer.toString(Srs44);
	        dingJieGuo.setText(Srs4);
	    }
}
