type Action =
| { type: 'counter/minus' }
| { type: 'counter/plus' }
| { type: 'counter/reset' }
| { type: 'counter/change', payload: number }

export default Action