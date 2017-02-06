likes(marry,X):-animals(X),!.
likes(marry,X):-snakes(X),!,fail.

snakes(cobra).
snakes(harara).
snakes(python).


animals(cat).
animals(dog).
animals(snakes).
animals(elephant).

% animals(X):-cat(X). 
% animals(X):-dog(X). 
% animals(X):-snakes(X). 
% animals(X):-elephant(X). 
% cat(a). 
% dog(b). 
% snakes(c). 
% elephant(d).
