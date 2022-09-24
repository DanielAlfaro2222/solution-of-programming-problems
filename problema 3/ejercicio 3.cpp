#include <bits/stdc++.h>

using namespace std;

int main()
{
	int num;
	int total;
	int cantidad;
	
	total = 0;
	
	cin>>num;
	
	cantidad = num - 1;
	
	list<int> numeros;
	
	for(int i = 1; i < num; i++) {
		numeros.push_back(i);
	}
	
	if (num != 1 && num != 2) {
		for(int i : numeros) {
			for(int j : numeros) {
				int suma;
				
				suma = i + j;
				
				if (suma == num) {
					total = total + 1;
				}
			}
		}
	} else if (num == 2) {
		total += 1;
	}
	
	cout<<total;
	
	return 0;
}
