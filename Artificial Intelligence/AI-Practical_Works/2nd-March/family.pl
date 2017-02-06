father(rajparsad,gopal).
father(ramparsad,tikamaya).
father(gopal,sagar).

wife(ramadevi,rajprasad).
wife(sabitri,ramprasad).
wife(tikamaya,gopal).

son(X,Y):-father(Y,X).
son(X,Y):-wife(Y,Z),father(Z,X).
mother(X,Y):-wife(X,Z),father(Z,Y).

grandfather(X,Y):-father(X,Z),father(Z,Y).
grandfather(X,Y):-father(X,Z),mother(Z,Y).
grandfather(X,Y):-mother(X,Z),father(Z,Y).
grandfather(X,Y):-mother(X,Z),mother(Z,Y).
