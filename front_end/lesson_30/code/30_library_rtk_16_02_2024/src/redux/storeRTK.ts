import { configureStore } from "@reduxjs/toolkit";

// Дефолтный импорт (из 22 строки Slice)
import sandwichReducer from "./sandwich/sandwichSlice";
import counterReducer from "./counter/counterSlice";
import libraryReducer from "./library/librarySlice";

// Именной импорт (из 7 строки Slice)
// import { sandwichReducer } from "./sandwich/sandwichSlice";

export const storeRTK = configureStore({
    reducer: {
        sandwich: sandwichReducer,
        counter: counterReducer,
        library: libraryReducer
    }
})

export type RootState = ReturnType<typeof storeRTK.getState>;