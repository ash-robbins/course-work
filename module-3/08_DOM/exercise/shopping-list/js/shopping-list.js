// add pageTitle
let pageTitle = "My Shopping List";
// add groceries
let groceries = ["milk", "eggs", "bacon", "cereal", "juice", "bread", "cheese", "cookies", "bananas", "ice cream"];
/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
document.getElementById('title').innerText = pageTitle;
}
/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  for (let i = 0; i < groceries.length; i++){
    const groceryItem = document.createElement('li');
    groceryItem.classList.add('item');
    groceryItem.innerText = groceries[i];
    const groceryList = document.getElementById('groceries');
    groceryList.appendChild(groceryItem);
  }
 return groceryList;

}

/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {
  const groceryListItems = document.querySelectorAll('.item');

  for(let i = 0; i < groceryListItems.length; i++){
  groceryListItems[i].classList.add('completed');
  }
}

setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});


//