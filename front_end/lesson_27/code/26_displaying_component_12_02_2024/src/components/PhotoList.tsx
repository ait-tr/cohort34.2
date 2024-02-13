import React, { createContext, useEffect, useState } from "react";
import Photo from "./Photo";

export interface IPhoto {
  albumId: number;
  id: number;
  title: string;
  url: string;
  thumbnailUrl: string;
}

export const PhotoContext = createContext({
  albumId: 1,
  id: 1,
  title: '',
  url: '',
  thumbnailUrl: ''
})

const PhotoList = () => {
  const [photos, setPhotos] = useState<IPhoto[] | null>(null);

  useEffect(() => {
    fetch('https://jsonplaceholder.typicode.com/photos')
      .then(response => response.json())
      .then(data => setPhotos(data))
  }, [])

  return (
    <div>
        {photos && photos.map((photo, index) => (
          <PhotoContext.Provider key={index} value={photo}>
            <Photo photo={photo} />
          </PhotoContext.Provider>
        ))}
    </div>
  );
};

export default PhotoList;
