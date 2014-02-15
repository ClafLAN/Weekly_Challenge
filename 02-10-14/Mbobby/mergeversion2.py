"""
	Emmanuel E. Mong
	Claflan Devs
	Merging two sorted Lists
"""

#sorted list 1
list_1 = [1,2,3,4,5]

#sorted list 2
list_2 = [6,7,8,9,10]

#instantiating the final list to hold the two sorted lists
merged_list = []

#list variables
l1_index = 0
l2_index = 0


#first while loop to populate final array in order
while(l1_index < len(list_1) and l2_index < len(list_2)):
	if(list_1[l1_index] < list_2[l2_index]):
		merged_list.append(list_1[l1_index])
		l1_index += 1
	else:
		merged_list.append(list_2[l2_index])
		l2_index += 1

#while loop to catch any left over elements in the list_1
while(l1_index < len(list_1)):
	merged_list.append(list_1[l1_index])
	l1_index += 1

#while loop to catch any left over elements in the list_2
while(l2_index < len(list_2)):
	merged_list.append(list_2[l2_index])
	l2_index += 1

#printing the final list very lazily: All thanks to Python "The lazy language (-__-)"
print merged_list

"""
	And that is the end of my merge function, hope you enjoyed reading it!!!!
"""