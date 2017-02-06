% This buffer is for notes you don't want to save.
% If you want to create a file, visit that file with C-x C-f,
% then enter the text in that file's own buffer.

female(bimala).
female(lina).
female(mita).
female(nitu).
female(pretty).
male(puran).
male(bikram).
male(fran).
parent(bimala,bikram).
parent(puran,bikram).
parent(bimala,lina).
parent(puran,lina).
parent(bimala,mita).
parent(puran,mita).
parent(nitu,pretty).
parent(fran,pretty).

father(X,Y):-parent(X,Y),male(Y).
mother(X,Y):-parent(X,Y),female(Y).




































