import React, { FC } from 'react';
import { IPost } from './PostsList';

interface IProps {
    info: IPost
}

const Post: FC<IProps> = ({ info: {body, title}}) => {
    // const obj = { a: 1, b: 2, c:3 }
    // const { a, b, c } = obj;
  return (
    <>
       <h2>{title}</h2> 
       <p>{body}</p>
    </>
  )
}

export default Post