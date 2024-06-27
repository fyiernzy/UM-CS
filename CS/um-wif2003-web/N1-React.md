*Reference: Chapter 5, 6*
## 1 - Introduction
---
1. React is a JavaScript library created by Facebook for building **single-page application (SPA)**. 
2. React allows developers to create user interfaces by building components and combining them into pages.
3. React requires `npm` and `Node.js` to run in production.
4. To write React directly in HTML, we need to include three scripts
	1. https://unpkg.com/react@18.3.1/umd/react.development.js
	2. https://unpkg.com/react-dom@18.3.1/umd/react-dom.development.js
	3. https://unpkg.com/@babel/standalone@7.24.7/babel.min.js

## 2 - Creating a React Application
There are two easy ways to create a React application:
1. Using `npx create-react-app my-react-app`
2. Using `npm create vite@latest my-react-app --template react`

| `create-react-app` | `npm create vite@latest` |
| ------------------ | ------------------------ |
| Run at port 3000   | Run at port 5173         |
| Much slower        | Much faster              |

## 3 - Working Mechanism
---
1. Virtual DOM
	1. React manipulates a Virtual DOM before updating the browser DOM, changing only what needs to be updated.
2. Rendering
	1. `index.js`, located in `src`, is the entry point of a React application. It renders and attaches the root component (`App.js`) to the HTML document, setting up the React DOM and providing initial rendering of the app.
	2. React renders HTML to the web page using the `createRoot()` and `render()` functions. 
		1. `createRoot()` takes an HTML element as its only argument and defines where a React component should be displayed. 
		2. `render()` defines the React components to render.
3. JavaScript XML (JSX)
	1. JSX allows developers to write HTML in JavaScript, placing HTML elements in the DOM without `createElement` or `appendChild` methods. 
	2. JSX converts HTML tags into React elements.
```javascript
const root = 
	  ReactDOM.createRoot(document.getElementById('root'));
	  root.render(
		  <p>Hello World!</p>
	  );
```

```html
<!--Hidden codes-->
<div id="root"></div>
<!--Hidden codes-->
```


## 4 - Core concepts in React
---
### 4.1 - Components
1. React components are independent and reusable UI elements that combines CSS (presentation) and JavaScript (logic). 
2. They work in isolation and return HTML. 
3. There are two types of React components, which are class and function components.
4. Rules for using components
	1. Use `className` instead of `class` for styling.
	2. Use `<ComponentName />` to include a component.
	3. Use `import ComponentName from '<relative-path>';` to import a component.

### 4.2 - Props
1. Props (properties) are immutable data passed from a parent component to a child component. Immutable means they cannot be changed/ modified, ensuring predictable behavior.
3. Props are used for communication between components and can be any JavaScript value, including objects, arrays and functions. Examples: `className`, `src`, `alt`, `width` and `height`.
[Learn more about passing props to a component](https://react.dev/learn/passing-props-to-a-component).

### 4.3 - State
1. State is mutable data specific to an instance of a component.
2. State changes trigger re-render of components on the page.
3. State is used for handling dynamic data. Examples: counters, data fetched from an API, form information.

### 4.4 - Events
Events handler are functions triggered in response to interactions such as clicking, hovering and focusing. 
[Learn more about responding to events](https://react.dev/learn/responding-to-events).

### 4.5 - Hooks
1. Follows [[A1-Rules of Hooks]]
2. All react hooks should be used at the top level of components.
3. `useState` 
	1. A React Hook that adds a state variable and should be called inside a component.
	2. Returns an array containing of `state` and a `setState` function. 
		- `state` refers to the piece of state itself 
		- `setState` refers to a function to change the piece of state.
		[Learn more about `useState`](https://react.dev/reference/react/useState).

### 4.6 - Rules of React
- [Components and Hooks must be pure](https://react.dev/reference/rules/components-and-hooks-must-be-pure) – Purity makes your code easier to understand, debug, and allows React to automatically optimize your components and hooks correctly.
- [React calls Components and Hooks](https://react.dev/reference/rules/react-calls-components-and-hooks) – React is responsible for rendering components and hooks when necessary to optimize the user experience.
- [Rules of Hooks](https://react.dev/reference/rules/rules-of-hooks) – Hooks are defined using JavaScript functions, but they represent a special type of reusable UI logic with restrictions on where they can be called.
*(ref: https://react.dev/reference/react)*

## 5 - Appendix
---
1. The `map()` method of Array instances creates a new array populated with the results of calling a provided function on every element in the calling array.
	- [Learn more about rendering lists](https://react.dev/learn/rendering-lists)
	- [MDN reference for `map()`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/map)

2. `export default` exports a single value or component from a module, allowing other scripts to import it by default.






















### Study Principle
---
1. 整理好 Basic Theory
2. 研究 Code + 打 Code + Tutorial
5. Practices + 考题 + 练习
3. 理清不懂的 Concept
4. 读 Extra Readings
6. 读 Extra + Interview Question
