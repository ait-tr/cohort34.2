import React, { FC, useEffect, useState } from "react";
import { IPhoto } from "./PhotoList";

interface IProps {
  photo: IPhoto;
}

const Photo: FC<IProps> = ({ photo: { title, url, thumbnailUrl } }) => {
  const [isBig, setIsBig] = useState<boolean>(false);
  const [width, setWidth] = useState<number>(window.innerWidth);

  useEffect(() => {
    setWidth(window.innerWidth);
    width > 1200 ? setIsBig(true) : setIsBig(false);
  }, [width, isBig])

  return (
    <>
      {isBig ? (
        <img src={url} alt={title} />
      ) : (
        <img src={thumbnailUrl} alt={title} />
      )}
    </>
  );
};

export default Photo;
