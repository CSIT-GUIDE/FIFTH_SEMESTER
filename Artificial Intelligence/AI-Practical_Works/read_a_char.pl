% This buffer is for notes you don't want to save.
% If you want to create a file, visit that file with C-x C-f,
% then enter the text in that file's own buffer.

read_a_char(C):-
	write('Type: '),flush_output,
	get(C).
