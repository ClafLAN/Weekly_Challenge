'''
*Collins Sirmah 
*Week 1 Challenge
'''

def first_sortList (list1,list2):
	'This is the simpler version using exclusively python built in methods'
	
	list3 = list1 + list2
	
	list3.sort()

	return list3

def second_sortList(list1,list2):
	'This is a slightly more complicated version of the two methods'
	
	length1 = len(list1)
	length2 = len(list2)
	
	list3 = list()
	x = 0

	if length1 == length2 or length1 > length2:
		x = length1
	else:
		x = length2
		
	count1=0
	count2=0

	for y in range(x):
		
		if list1 [count1] < list2 [count2]:
			list3.append(list1 [count1])
			count1+=1

		elif list2 [count2] < list1 [count1]:
			list3.append(list2 [count2])
			count2 += 1

		elif list1[count1] ==list2[count2]:
			list3.append(list1)
			list3.append(list2)
			count1 += 1
			count2 += 1

	if count1 != x :
		for q in range (count1, x):
			list3.append(list1 [count1])
			count1 += 1

	if count2 != x:
		for z in range( count2, x):
			list3.append(list2[count2])
			count2 += 1

	return list3

#Test sample1
list1 = [1,4,5,6,7]
list2 = [0,9,10,11,21]

print "This is list 1 :", list1
print "This is list 2 :", list2, "\n"

print "This is the output from the first method"
print first_sortList (list1,list2), "\n"

print "This is the output from the second method"
print second_sortList (list1,list2), "\n"

