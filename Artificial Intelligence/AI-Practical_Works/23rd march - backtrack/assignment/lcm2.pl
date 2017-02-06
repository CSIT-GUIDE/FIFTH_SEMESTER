hcf(X,0,X).
hcf(X, Y, G) :- X = Y, G = X, !.
hcf(X, Y, G) :- X < Y, Y1 is (Y-X), hcf(X, Y1, G), !.
hcf(X, Y, G) :- X > Y, hcf(Y, X, G).
lcm(X,Y,L):-hcf(X,Y,G), L is X*Y/G, !. 
