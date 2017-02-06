crispy(snap).
crispy(crackle).
crispy(pop).
breakfast(A,B,C):-crispy(A),crispy(B),crispy(C), not(A=B), not(B=C), not(A=C).
