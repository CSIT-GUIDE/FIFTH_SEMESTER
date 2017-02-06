cube:-write("Enter :"), read(X),process(X).
process(stop):-!.
process(N):- c is N*N*N, write("Cube of"),write(N),write("is"), write(c),nl,cube.
