## 1

- the first alert will print 25
- the second alert will print 81
- the third alert will print 2
- the fourth alert will print undefined

\*about the fourth output: the variable squareOfA is defined inside a function and therefore is a local variable, it cannot be accesed outside the function. To make it accesible you migth want to make it global.

## REACT SECTION

### 1.What are props in a component? Select all the options that apply.

- They are the parameters of a component.
- It is a mechanism to put data inside the component.

### 2.What is a component? Mark only one option.

- A function or class that returns an element.

### 3.Which of these component types are valid? Select all the options that apply

- Class Component.
- Parent Component.
- Child Component.

- Did you mean "Functional Component" instead of "Component Function"?

### 4.What does the term JSX refer to?

- It is the mix between pure HTML and javascript , for this reason JSX is
  used to identify React syntax.

### 5.How do I pass a value from a parent component to a child component?

- Using props.
- Using values from the global application context usage.

### 6.Which of these implementations change the state of a component?

- setValue(“my value”).

### 7.How many and which arguments does useEffect Hook receive?

- Two arguments, which are the effect and the dependencies.

### 8.How do you import Javascript modules installed with NPM or YARN?

- import name from 'name';

### 9.What functionality does the use of Context API provide?

- It is a mechanism that provides a way to pass data through the component
  tree without manually passing props at all levels.
- It is a functionality that facilitates the handling of data from parent
  components to child components.
- It is a React modality that replaces the use of props in its entirety to be
  able to consume variable values no matter where they are located,
  facilitating data management throughout the application.

### 10.How do I import the following component, considering that it is inside a file in the same directory, called MyComponent.js?

- import { MyComponent } from './MyComponent.js';

### 11.What is the difference between class components and functional components?

- class component are extension of the "React.Component" base class, they uses a render method. this mtypes of method are currently obsoletes and unused

* functional components use hooks to replicate the functionality of class components' lifecycle methods.

both components are syntactically different, being the functional components easier to read, write and be comprehended, this is one of the main reasons why, with the implementation of hooks, functional components have made class components obsolete.

### 12.How would you set the state of a component?

- in a functional component i would set the state of a component using the useState hook. Although there is a method for class component (setState) i wouldn't use class components.

### 13.What happens when we change the state of a component?

- The component re-renders to show the updated value of the state.

### 14.Write a component that renders a list of elements, given a prop that contains an array of objects in the following form: { firstname: "demo", lastname: "demo", dni: 1234 }.

- const PersonList = (props) => {
-     return (
-     <ul>
-         {props.people.map((person, index) => (
-             <li key={index}>
-                 {person.firstname} {person.lastname} ({person.dni})
-             </li>
-         ))}
-     </ul>
-     );
- };
- export default PersonList;

### 15.Write a component that receives a prop called "data", and renders an H1 with the content of data.

- const DataHeader = (props) => {
- return (
-     <h1>{props.data}</h1>
- );
- };
- export default DataHeader;

### 16.What is the error in the following component?

- The implementation of this component is correct, but it is called "Button" and it does not use the HTML "button" tag. Although any div element can have the "onClick" functionality, this implementation loses the button-specific CSS pseudoclasses and it would be more optimal to use the "button" tag instead.

### 17.Explain, in your own words, what this component does.

- This component renders a button and a counter. the button increases the value of the number and the counter displays the number itself. although this is not a good implementation.

* this would be a better implementation:

- import { useState } from "react";
-
- const Component = () => {
- const [state, setState] = useState(1);
-
- const click = () => {
-     setState(state + 1);
- };
-
- return (
-     <div>
-       <h1>{state}</h1>
-       <button onClick={click}>button</button>
-     </div>
- );
- };
-
- export default Component;

### 18.How would you make a Rest API call from JavaScript?

- Using the fetch method or, in react, the axios library.

* const consumeAPI = async() =>{
* const data = await fetch("hhttp://fake.ulr/clients", {
*     method: "...",
*     body: JSON.stringify(...),
*     headers: {
*       "Content-Type": "application/json",
*     },
* });
* const dataJson = await data.json()
* console.log(dataJson)
* }

### 19.What is the use of the useEffect hook?

- The useEffect hook is a hook that triggers a function any time a component in the array of dependencies gets rendered (or re-rendered), it's usually used to data fetching, subscription, and updating in response of user events

### 20.How would you develop a custom hook that exposes methods to save and modify a counter? The hook must have a parameter that allows the developer to specify how much the counter should add for each call to the setter.

- import { useState } from 'react';
-
- function useCounter(value = 1) {
- const [count, setCount] = useState(0);
-
- const add = () => setCount(count + value);
- const substract = () => setCount(count - value);
-
- return { count, add, substract };
- }
