#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
//1、在屏幕上输出以下图案：菱形
//   *
//  ***
// *****
//*******
// *****
//  ***
//   *
//也可以打印更大的菱形，输入一个数字，决定打印几行；
//分析：先打印上半部分，然后再打印下半部分；
//int main()
//{
//	int i = 0;//定义一个临时变量来循环
//	int line = 0;//表示行数
//	printf("请输入要求的行数：");
//	scanf("%d", &line);
////先打印上半部分。
//	for ( i = 1; i <= line; i++)
//	{
//		int j = 0;//临时变量用来输出空格
//		int k = 0;//临时变量用来输出符号‘*’；
//		for ( j = 1; j <= line-i; j++)
//		{
//			printf(" ");
//		}
//		for ( k = 1; k <= (2*i-1); k++)
//		{
//			printf("*");//（2*i-1代表每一行输出的星号的个数，是这行的行数乘2减1；
//		}
//		printf("\n");
//	}
////然后打印下半部分，下半部分的话比上部分少一行，少最长的那一行；
////所以实现功能跟打印上半部分的差不多，也就是少一层循环而已；
////就是倒着打印（line-1）层；
//	for ( i = line-1; i >= 1; i--)//下半部分比上半部分少了一行，最长的那一行；
//	{
//		int j = 0;//临时变量用来输出空格
//		int k = 0;//临时变量用来输出符号‘*’；
//		for ( j = 1; j <= line-i; j++)
//		{
//			printf(" ");
//		}
//		for ( k = 1; k <= (2*i-1); k++)
//		{
//			printf("*");
//		}
//		printf("\n");
//	}
//	system("pause");
//	return 0;
//}
//------------------------------------------------------------------------------------------
//2、求出0--999之间的所有“水仙花数”并且输出。
//分析：水仙花数是指一个三位数，则其各位数字的立方和恰好等于该数本身，
//如：153=1^3+5^3+3^3;则153就是一个水仙花数
//在数论中，水仙花数也成为自恋数、自幂数、阿姆斯壮数、阿姆斯特朗数
//是指一个N位数，其各个位的数的N次方之和等于该数
//int main()
//{
//	int i = 0;
//	int flag = 0;
//	for ( i = 1; i < 99999; i++)//打印1--99999的水仙花数
//	{
//		
//		int num = 0;
//		int x = i;//取临时变量来进行运算，不能改变进入循环的i的值，因为后面要进行比较
//		int count = 1;
//		while (x>9)
//		{
//			count++;
//			x = x/10;//计算所要求的数的位数
//		}
//		int y = i;
//		while (y)
//		{
//			num += pow(y % 10, count);
//			y = y / 10;
//		}
//		if (num == i)
//		{
//			printf("%d\n", num);
//			flag++;
//		}
//	}
//	printf("一共有%d个水仙花数\n",flag);
//	system("pause");
//	return 0;
//}
//--------------------------------------------------------------------------------
//3、求Sn=a+aa+aaa+aaaa+aaaaa的前五项的和，其中a是一个数字，
//例如：2+22+222+2222+22222
//分析，先求出每一项的数字，然后求其和
int main()
{
//	int n = 0;
//	int a = 0;
//	printf("请分别输入要求的数以及前n项和：");
//	scanf("%d  %d", &a, &n);
//	int y = n;
//	int num = 0;
//	int sum = 0;
//	while (n>0)
//	{
//		int k = n;
//		for (k; k>0; k--)//用for循环从最高位开始求，最大的数字开始求
//		{
//			num += a*pow(10, k - 1);
//		}
//		n--;
//		sum += num;//倒数着加上每一项的数
//	}
//	
//	printf("前%d项和为%d\n",y, num);
	////第二种方法：
	int a = 0;
	int k = 0;
	int sum = 0;
	int temp = 0;
	int i = 0;
	scanf("%d %d", &a, &k);
	for ( i = 0; i < k; i++)
	{
		//计算当前长度的数 a,aa,aaa
		temp = temp * 10 + a;
		sum = sum + temp;
		printf(" %d+", temp);
	}
	printf("=");
	printf("%d\n", sum);
	int max = 0x7fffffff;
	printf("%d\n", max);
	system("pause");
	return 0;

}