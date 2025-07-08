Only call Hooks at the top level
Only call Hooks from React functions

Only call Hooks at the top level 
Functions whose names start with use are called Hooks in React.

Don’t call Hooks inside loops, conditions, nested functions, or try/catch/finally blocks. Instead, always use Hooks at the top level of your React function, before any early returns. You can only call Hooks while React is rendering a function component:

✅ Call them at the top level in the body of a function component.
✅ Call them at the top level in the body of a custom Hook.
It’s not supported to call Hooks (functions starting with use) in any other cases, for example:

🔴 Do not call Hooks inside conditions or loops.
🔴 Do not call Hooks after a conditional return statement.
🔴 Do not call Hooks in event handlers.
🔴 Do not call Hooks in class components.
🔴 Do not call Hooks inside functions passed to useMemo, useReducer, or useEffect.
🔴 Do not call Hooks inside try/catch/finally blocks.

Only call Hooks from React functions 
Don’t call Hooks from regular JavaScript functions. Instead, you can:

✅ Call Hooks from React function components.
✅ Call Hooks from custom Hooks.

By following this rule, you ensure that all stateful logic in a component is clearly visible from its source code.