import { PayloadAction, createSlice } from "@reduxjs/toolkit";
import { uid } from "uid";

interface IAddBookPayload {
    title: string,
    author: string,
    year: string
}

const initialState = {
    books: [
        { isbn: '1', title: 'Крутой маршрут', author: 'Евгения Гинзбург', year: '1956' }
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
        }
    }
});

export const { addBook } = librarySlice.actions;

export default librarySlice.reducer;