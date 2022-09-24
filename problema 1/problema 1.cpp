#include <bits/stdc++.h>

using namespace std;

int main()
{
	int numero_casos;
	
	cin>>numero_casos;
	
	for(int i = 0; i < numero_casos; i++) {
		int horas;
		
		cin>>horas;
		
		if (horas >= 7) {
			cout<<"NO"<<endl;
		} else {
			cout<<"YES"<<endl;
		}
	}
	
	return 0;
}
