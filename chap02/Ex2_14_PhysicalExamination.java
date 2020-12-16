/*
 * Ŭ������ �迭
 * �ǽ� 2-14�� ��ü�˻� �����͸� ���ε����� �迭�� ������ �ƴ� Ŭ������ �迭�� ������ 
 * ���α׷��Դϴ�. Ŭ���� PhyscData�� �̸�(String��), Ű(int��), �÷�(double��)�� �ѱ�����
 * ���� ���Դϴ�. �� ���α׷��� ��ü�˻� �������� �˶�ǥ�� ��Ÿ���� ��� Ű�� �÷��� ������ 
 * �����ݴϴ�.
 */
package chap02;

import java.util.Scanner;

//��ü �˻� �����Ϳ� Ŭ���� �迭���� ��� Ű�� �÷��� ������ ����

public class Ex2_14_PhysicalExamination {
	
	static final int VMAX = 21; //�÷� ����(0.0���� 0.1 ������ 21��)
	
	static class PhyscData{
		String name;				//�̸�
		int    height;				//Ű
		double vision;				//�÷�
		
		
		//������
		public PhyscData(String name, int height, double vision) {
			// TODO Auto-generated constructor stub
			this.name = name;
			this.height = height;
			this.vision = vision;
			
		}	
	}
	
	//Ű�� ��հ��� ����
	static double aveHeight(PhyscData[] dat) {
		
		double sum = 0;
		
		for(int i=0; i < dat.length; i++) {
			sum += dat[i].height;
		}
		
		return sum / dat.length;
	}
	
	//�÷� ������ ����
	static void disVision(PhyscData[] dat, int[] dist) {
		
		int i = 0;
		
		dist[i] = 0;
		for(i = 0; i < dat.length ; i++) {
			if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0) {
				dist[(int)(dat[i].vision * 10)]++;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		PhyscData[] x = {
				new PhyscData("������", 162, 0.3),
				new PhyscData("������", 173, 0.7),
				new PhyscData("������", 175, 2.0),
				new PhyscData("ȫ����", 171, 1.5),
				new PhyscData("�̼���", 168, 0.4),
				new PhyscData("�迵��", 174, 1.2),
				new PhyscData("�ڿ��", 169, 0.8),
				
		};
		int[] vdist = new int[VMAX];				//�÷º���
		
		System.out.println(" ��ü �˻� ����Ʈ  ");
		System.out.println("�̸�       Ű    �÷� ");
		System.out.println("--------------");
		for(int i = 0; i < x.length; i++) {
			System.out.printf("%-8s%3d%5.1f\n", x[i].name,x[i].height,x[i].vision);
		}
		System.out.printf("\n ��� Ű : %5.1fcm\n", aveHeight(x));
		
		disVision(x, vdist);						//�÷� ������ ����
		
		System.out.println("\n�÷� ����");
		for(int i = 0; i < VMAX ; i++) {
			System.out.printf("%3.1f~ : %2d��\n", i / 10.0, vdist[i]);
		}
		stdIn.close();
	}
}
