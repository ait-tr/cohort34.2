import { PayloadAction, createSlice } from "@reduxjs/toolkit";
import { uid } from "uid";

interface IAddBookPayload {
    title: string,
    author: string,
    year: string
}

const initialState = {
    books: [
        { isbn: '1', title: 'Крутой маршрут', author: 'Евгения Гинзбург', year: '1967' }
    ]
};

export const librarySlice = createSlice({
    name: 'library',
    initialState,
    reducers: {
        addBook: (state, action: PayloadAction<IAddBookPayload>) => {
            state.books.push({
                isbn: uid(),
                ...action.payload
            })
        },
        delBook: (state, action: PayloadAction<number>) => {
            state.books.splice(action.payload, 1);
            // state.books = state.books.filter((_, index) => index !== action.payload);
        }
        // delBook: (state, action: PayloadAction<string>) => {
        //     const index = state.books.findIndex(book => book.isbn === action.book);
        //     state.books.splice(index, 1);
        
        //     state.books = state.books.filter(book => book.isbn !== action.payload);
        // }
    }
});

export const { addBook, delBook } = librarySlice.actions;

export default librarySlice.reducer;