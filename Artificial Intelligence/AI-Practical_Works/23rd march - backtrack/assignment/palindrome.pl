rev([],Z,Z).
rev([H|T],Z,Acc) :- rev(T,Z,[H|Acc]).
palindrome(L):-rev(L,L,[]).
