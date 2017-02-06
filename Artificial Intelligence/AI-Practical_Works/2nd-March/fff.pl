fibo(0, 0).
fibo(1, 0):-write('0').

fibo(X, Y):- X>1,write('0 1 '),X > 0, fibo(X-1, Y, _).

fibo(1, 1, 0).

fibo(X, Y1, Y2) :- X > 1,
             X1 is X - 1,
             fibo(X1, Y2, Y3),
             Y1 is Y2 + Y3,
	write(Y1),write(' ').


