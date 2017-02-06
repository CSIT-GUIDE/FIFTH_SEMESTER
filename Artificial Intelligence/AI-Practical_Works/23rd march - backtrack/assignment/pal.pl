pal([]).
pal([_]).
pal(Pal):- append([H|T], [H], Pal),pal(T).
