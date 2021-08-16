import { NativeModules } from 'react-native';

type EosEccType = {
  sign(data: string, privateKey: string): Promise<string>;
};

const { EosEcc } = NativeModules;

export default EosEcc as EosEccType;
