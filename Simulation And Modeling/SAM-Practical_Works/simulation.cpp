#include <iostream>
#include <fstream>
#include <stdlib.h>//contains rand() function
#include <math.h>
#include <iomanip>
using namespace std;
int main()
{
/* Single server single queue:
arrival and service times are exponentially distributed.
iat is inter arrival time.
count a and count b are counters for server A and B.
qa(qb) are que length of component A(B).
*/
//M/M/1/infinity queue
double r,iat;
double mue=1/6., lemda=1/5., run=180.;
double clock=0.00,se=0.00,sb=0.00,nat=0.00,cit=0.00,cwt=0.00,st=0.00,it=0.00,wt=0.00;
int q=0,cq=0,k,count=0,qmax=100;
ofstream outfile("output.txt",ios::out);
outfile<<"\n\n CLOCK IAT NAT QUE SB ST SE IT WT CIT CWT\n";
r=rand()/32768.;
cout<<"rand="<<r<<endl;
iat=(–1./mue)*log(1–r);
nat = nat+iat;
count=count+1;
// cout<<nat<<count<<endl;
// getch();
while(clock<=run) {
if(q>qmax) qmax=q;
outfile<<setprecision(4)<<clock<<'\t'<<setprecision(4)<<iat<<'\t'<<
setprecision(4)<<nat<'\t'<<setprecision(4)<<q<<'\t'<<setprecision(4)<<sb<<'
\t'<<setprecision(4)<<st<<'\t'<<setprecision(4)<<se<<'\t'<<setprecision(4)<<it<<'\
t'<<setprecision(4)<<wt<<'\t'<<setprecision(4)<<cit<<'\t'<<setprecision(4)<<cwt<<endl;
if(nat>=se){
if(q>0){
wt=q*(se–clock);
cwt=cwt+wt;
q=q–1;
clock=se;
}
else
{ clock=nat;
r=rand()/32768.;
iat=(–1/mue)*log(1–r);
nat = nat=iat;
count=count+1;
}
sb=clock;
it=clock– se;
cit=cit+it;
r=rand()/32768.;
st=(–1/lemda)*log(1–r);
se=sb+st;
}
else{
wt=q*iat;
cwt=cwt+wt;
clock=nat;
q=q + 1;
r=rand()/32768.;
st=(–1/lemda)*log(1–r);
nat=nat+iat;
count=count+1;
}
}
outfile<<"Elapsed time="<<clock<<"Number of arrivals="<<count<<endl;
outfile<<"Average waiting time/arrival="<<cwt/count<<endl;
outfile<<"Average server idle time/arrival="<<cit*100./clock<<endl;
outfile<<"Qmax="<<qmax<<endl;
cout<<"\n any 'digit";
cin >> k;

return 0;
}
