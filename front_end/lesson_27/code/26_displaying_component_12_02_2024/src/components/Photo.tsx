import React, { FC, useContext, useEffect, useState } from "react";
import { IPhoto, PhotoContext } from "./PhotoList";

interface IProps {
  photo: IPhoto;
}

const Photo: FC<IProps> = () => {
  const [isBig, setIsBig] = useState<boolean>(false);
  const [width, setWidth] = useState<number>(window.innerWidth);

  const {thumbnailUrl, title, url} = useContext(PhotoContext);

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
