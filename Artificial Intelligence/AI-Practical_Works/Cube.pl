cube :- read(X), process(X).
process(stop):-!.
precess(N):- C is N*N*N, write(C), cube.
