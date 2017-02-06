class nQueen():
	solutions = [[]]
	def __init__(self, row, col):
		self.row = row
		self.col = col
	def queensproblem(self,row, col):
		for r in range(row):
			solutions = add_one_queen(row, columns, solutions)
	
	def add_one_queen(new_row, columns, prev_solutions):
		for solution in prev_solutions:
			for new_column in range(columns):
				if(no_conflict(new_row, new_column, solution)):
					return [solution + [new_column]]

	def no_conflict(new_row, new_column, solution):
		for row in range(new_row):
			x = (solution[row] != new_column and solution[row] + row != new_column + new_row and solution[row] - row != new_column - new_row)
		return x
	

	
def main_function():
	row = int(raw_input("Enter no of row:\n"))
	col = int(raw_input("Enter no of columns:\n"))
	nQueenObj = nQueen(row,col)
	for solution in nQueenObj.queensproblem(row, col):
		print(solution)

if __name__=="__main__":
	main_function()
