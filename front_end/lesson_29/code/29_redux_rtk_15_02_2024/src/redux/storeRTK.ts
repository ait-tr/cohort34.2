import { configureStore } from "@reduxjs/toolkit";

// Дефолтный импорт (из 22 строки Slice)
import sandwichReducer from "./sandwich/sandwichSlice";

// Именной импорт (из 7 строки Slice)
// import { sandwichReducer } from "./sandwich/sandwichSlice";

export const storeRTK = configureStore({
    reducer: {
        sandwich: sandwichReducer,
        // counter: counterReducer
    }
})

export type RootState = ReturnType<typeof storeRTK.getState>;