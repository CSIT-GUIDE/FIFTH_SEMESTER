% This buffer is for notes you don't want to save.
% If you want to create a file, visit that file with C-x C-f,
% then enter the text in that file's own buffer.

bigger(X,Y,Z):-
	X>Y,Z=X. %here we've used third variable Z to store the result.
bigger(X,Y,Z):-
	X<Y,Z=Y.
