from main import mlops

mlopsObj = mlops(5)
def test_getTotalStudents():
	assert mlopsObj.getTotalStudents() == 5

def test_addStudent():
	mlopsObj.AddStudent()
	assert mlopsObj.getTotalStudents() == 6

def test_removeStudent():
	mlopsObj.removeStudents()
	assert mlopsObj.getTotalStudents() == 5

def test_getClassName():
	assert mlopsObj.getTotalStudents() == 6

def test_removeStudent():
	mlopsObj.removeStudents()
	assert mlopsObj.getTotalStudents() == 5

def test_getClassName():
	assert mlopsObj.getClassName() == "Machine Learning Operations (CS-B)"

