adminworker(black).
adminworker(white).
officejunior(green).
manager(brown).
manager(grey).
supervise(X,Y):-adminworker(X),adminworker(Y).
supervise(X,Y):-adminworker(X),officejunior(Y).
supervise(X,Y):-manager(X),officejunior(Y).
