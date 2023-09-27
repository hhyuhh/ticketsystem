#include<stdio.h>
int main() {
	int n, k, f[31], temp;
	for (int i = 0; i <= 30; i++) {
		f[i] = 0;
		
	}//对数组进行初始化
	printf("请输入k 的值：\n温馨提示k的值大于等于1小于等于5\n");
	scanf_s("%d", &k);
	printf("请输入n 的值：\n温馨提示n的值大于等于0小于等于30\n");
	scanf_s("%d", &n);

	f[k - 1] = 1;
	for (int i = k; i<= 30; i++) {
		for (int j = 1; j <= k; j++) {
			f[i] += f[i - j];
		}
	}//将该数组的从第k+1项依次算出来
	printf("该%d阶序列第%d项是：%d",k, n + 1, f[n]);
	
		
	return 0;
}