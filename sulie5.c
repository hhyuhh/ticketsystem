#include<stdio.h>
int main() {
	int n, k, f[31], temp;
	for (int i = 0; i <= 30; i++) {
		f[i] = 0;
		
	}//��������г�ʼ��
	printf("������k ��ֵ��\n��ܰ��ʾk��ֵ���ڵ���1С�ڵ���5\n");
	scanf_s("%d", &k);
	printf("������n ��ֵ��\n��ܰ��ʾn��ֵ���ڵ���0С�ڵ���30\n");
	scanf_s("%d", &n);

	f[k - 1] = 1;
	for (int i = k; i<= 30; i++) {
		for (int j = 1; j <= k; j++) {
			f[i] += f[i - j];
		}
	}//��������Ĵӵ�k+1�����������
	printf("��%d�����е�%d���ǣ�%d",k, n + 1, f[n]);
	
		
	return 0;
}