import React, { FC } from 'react';
import { IPost } from './PostsList';

interface IProps {
    info: IPost
}

const Post: FC<IProps> = ({ info: {body, title}}) => {
    // const obj = { a: 1, b: 2, c:3 }
    // const { a, b, c } = obj;
  return (
    <div className='border border-dark border-1 my-2 rounded p-3'>
       <h2 className='text-center'>{title}</h2> 
       <p style={{textAlign: 'justify', textIndent: '30px'}}>{body}</p>
    </div>
  )
}

export default Post