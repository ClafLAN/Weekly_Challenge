'''
*Collins Sirmah 
*Week 1 Challenge
'''

def first_sortList(list1,list2):
	'This is the simpler version using exclusively python built in methods'

	#Append the two lists together into a new list3
	list3=list1+list2

	#Use the sort command to sort the two lists 
	list3.sort()

	#return the third list
	return list3

def second_sortList(list1,list2):
	'This is a slightly more complicated version of the two methods'
	#Get the lengths of both lists
	length1=len(list1)
	length2=len(list2)

	#Create an empty list to append to
	list3=list()

	#Get the length of the longer list 
	x=0

	if length1==length2 or length1 > length2:
		x=length1

	else:
		x=length2

	#Two variables to keep count of the iteration
	count1=0
	count2=0

	#Iterate through the list
	for y in range(x):
		#If item in list 1 at count1(index) is less than item in list 2 count2 append it to a new list 3
		#Increase counter1
		if list1[count1]<list2[count2]:
			list3.append(list1[count1])
			count1+=1

		#If item in list 2 at count2(index) is less than item in list1 at count1 append it to new list 3
		#Increase counter3
		elif list2[count2]<list1[count1]:
			list3.append(list2[count2])
			count2+=1

		#If both are the same at count 2 and count  1 append both to list 3. Does not eliminate duplicates
		elif list1[count1]==list2[count2]:
			list3.append(list1)
			list3.append(list2)
			count1+=1
			count2+=1

	#Apends the items that remain in one of the two lists to the list 3 to complete the whole list 
	if count1 != x :
		for q in range(count1,x):
			list3.append(list1[count1])
			count1+=1

	if count2 != x:
		for z in range(count2,x):
			list3.append(list2[count2])
			count2+=1

	return list3

#Test sample1
list1=[1,4,5,6,7]
list2=[0,9,10,11,21]

print "This is list 1 :",list1
print "This is list 2 :",list2, "\n"

print "This is the output from the first method"
print first_sortList(list1,list2), "\n"

print "This is the output from the second method"
print second_sortList(list1,list2), "\n"

