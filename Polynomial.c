// C++ program for addition of two polynomials 
// using Linked Lists 
#include<stdio.h> 

// Node structure containing power and coefficient of variable 
struct Node 
{ 
	int coeff; 
	int pow; 
	struct Node *next; 
}; 
			
// Function to create new node 
void create_node(int x, int y, struct Node **temp) 
{ 
	struct Node *a, *h; 
	h = *temp; 
	if(h == NULL) 
	{ 
		a =(struct Node*)malloc(sizeof(struct Node)); 
		a->coeff = x; 
		a->pow = y; 
		*temp = a; 
		a->next = (struct Node*)malloc(sizeof(struct Node)); 
		a = a->next; 
		a->next = NULL; 
	} 
	else
	{ 
		a->coeff = x; 
		a->pow = y; 
		a->next = (struct Node*)malloc(sizeof(struct Node)); 
		a = a->next; 
		a->next = NULL; 
	} 
} 

// Function Adding two polynomial numbers 
void polyadd(struct Node *poly1, struct Node *poly2, struct Node *poly) 
{ 
while(poly1->next && poly2->next) 
	{ 
		// If power of 1st polynomial is greater then 2nd, then store 1st as it is and move its pointer 
		if(poly1->pow > poly2->pow) 
		{ 
			poly->pow = poly1->pow; 
			poly->coeff = poly1->coeff; 
			poly1 = poly1->next; 
		} 
		
		// If power of 2nd polynomial is greater then 1st, then store 2nd as it is and move its pointer 
		else if(poly1->pow < poly2->pow) 
		{ 
			poly->pow = poly2->pow; 
			poly->coeff = poly2->coeff; 
			poly2 = poly2->next; 
		} 
		
		// If power of both polynomial numbers is same then add their coefficients 
		else
		{ 
			poly->pow = poly1->pow; 
			poly->coeff = poly1->coeff+poly2->coeff; 
			poly1 = poly1->next; 
			poly2 = poly2->next; 
		} 
		
		
		poly->next = (struct Node *)malloc(sizeof(struct Node)); 
		poly = poly->next; 
		poly->next = NULL; 
	} 
while(poly1->next || poly2->next) 
	{ 
		if(poly1->next) 
		{ 
			poly->pow = poly1->pow; 
			poly->coeff = poly1->coeff; 
			poly1 = poly1->next; 
		} 
		if(poly2->next) 
		{ 
			poly->pow = poly2->pow; 
			poly->coeff = poly2->coeff; 
			poly2 = poly2->next; 
		} 
		poly->next = (struct Node *)malloc(sizeof(struct Node)); 
		poly = poly->next; 
		poly->next = NULL; 
	} 
} 

void show(struct Node *node) 
{ 
while(node->next != NULL) 
	{ 
	printf("%dx^%d", node->coeff, node->pow); 
	node = node->next; 
	if(node->next != NULL) 
		printf(" + "); 
	} 
} 


int main() 
{ 
	struct Node *poly1 = NULL, *poly2 = NULL, *poly = NULL; 
	int choice, n1,n2,x1,y1, x2, y2;
	printf("Enter number of terms in polynomial 1");
	scanf("%d", &n1);
	printf("Enter number of terms in polynomial 2");
	scanf("%d", &n2);
	printf("Enter choice of operation:\n 1.Addition \n 2.Subtraction \n");
	scanf("%d", &choice);
	if (choice == 1)
	{
    	for(int i = 0; i<n1; i++)
    	{
    	    printf("Enter %dth ", i+1);
    	    scanf("%d\n", &x1);
    	    scanf("%d\n", &y1);
    	    create_node(x1,y1,&poly1);
    	}
    	for(int i = 0; i<n2; i++)
    	{
    	    printf("Enter %dth ", i+1);
    	    scanf("%d\n", &x2);
    	    scanf("%d\n", &y2);
    	    create_node(x2,y2,&poly2);
    	}
    	poly = (struct Node *)malloc(sizeof(struct Node)); 
	
    	polyadd(poly1, poly2, poly); 
    	
    	printf("\nAdded polynomial: "); 
    	show(poly); 
	}
	
    else if (choice == 2)
    	{
        	for(int i = 0; i<n1; i++)
        	{
        	    printf("Enter %dth ", i+1);
        	    scanf("%d\n", &x1);
        	    scanf("%d\n", &y1);
        	    create_node(x1,y1,&poly1);
        	}
        	for(int i = 0; i<n2; i++)
        	{
        	    printf("Enter %dth ", i+1);
        	    scanf("%d\n", &x2);
        	    scanf("%d\n", &y2);
        	    create_node(-1*x2,y2,&poly2);
        	}
        	poly = (struct Node *)malloc(sizeof(struct Node)); 
    	
        	polyadd(poly1, poly2, poly); 
        	
        	printf("\nAdded polynomial: "); 
        	show(poly); 
    	}
	


return 0; 
} 
